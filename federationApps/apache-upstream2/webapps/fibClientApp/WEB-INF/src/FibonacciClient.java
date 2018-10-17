package test;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import java.net.*;

import org.apache.log4j.Logger;

class CascadedThreadParent implements Runnable {
    String fib;
    PrintWriter pw;

    CascadedThreadParent(String fib, PrintWriter pw) {
         this.fib = fib;
         this.pw  = pw;
    }
    public void run() {
        FibonacciClient.externalURL(fib, pw);
    }
}


class MyThread implements Runnable {
    String fib;
    PrintWriter pw;

    MyThread(String fib, PrintWriter pw) {
         this.fib = fib;
         this.pw  = pw;
    }
    public void run() {
        CascadedThreadParent myRunnable = new CascadedThreadParent(fib, pw);

        Thread myT = new Thread(myRunnable);
        myT.start();
        
        try {
        myT.join();
        }
        catch(InterruptedException ex) {
            pw.println("<h3> ---------InterruptedCascaddedThreadException------------ </h3>");
        }
//        FibonacciClient.externalURL(fib, pw);
    }
}

public class FibonacciClient extends HttpServlet {

    static Logger log = Logger.getLogger(FibonacciClient.class);
    static int counter = 0;
    static Random random = new Random();
    public final Random randomGenerator = new Random();
    static int recCounter = 0;

    public static void threadedExternalURL(final String fib, PrintWriter pw) {
        pw.println("<h3> ---------Inside threadedExternalURL ------------ </h3>");
        
        MyThread myRunnable = new MyThread(fib, pw);
//        MyThread myRunnable1= new MyThread(fib, pw);
//        MyThread myRunnable2= new MyThread(fib, pw);

        Thread myT = new Thread(myRunnable);
        myT.start();
        
        try {
        myT.join();
        }
        catch(InterruptedException ex) {
            pw.println("<h3> ---------InterruptedException------------ </h3>");
        }

        FibonacciClient.externalURL(fib, pw);
    }

    public static void externalURL(String fib, PrintWriter pw)
    {
        try {
        pw.println("<h3>External Result: Start</h1>"); // Display the string.

        String url = "http://localhost:8091/fibServerApp/fibServer?fib="+ fib;
//        String url = "https://localhost/fibServerApp/fibServer?fib="+ fib;

        URL oracle = new URL(url);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
        {
            pw.println("<h3>" + inputLine + "</h3>");
        }

        in.close();
        }
        catch(Exception x)
        {
            pw.println("<h3>Caught Exception: </h3>");
            x.printStackTrace();
        }
        pw.println("<h3>External Result: End</h3>"); // Display the string.
    }


    public void doGet( HttpServletRequest req,
                       HttpServletResponse res )
        throws ServletException, IOException
    {
        counter++;

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String fib=req.getParameter("fib");
        String local=req.getParameter("local");
        String threaded=req.getParameter("threaded");

        int fibOf = 0;
        boolean isRandom = false;
        boolean isError = false;
        boolean isException = false;
        boolean islocal = false;
        boolean isThreaded = false;
        if (local != null && local.equals("local") ){
            islocal = true;
        }

        if (threaded != null && threaded.equals("true") ){
            isThreaded = true;
        }

        if ( fib.equals("random") ) {
            int maxNo = 40;
            fibOf = Math.abs(random.nextInt(maxNo));
            isRandom = true;
        }
        else if ( fib.equals("stall") ) {
            int maxNo = 35;
            // fibOf = Math.abs(random.nextInt(maxNo));
            fibOf = 35;
            try{
                Thread.sleep(1*1000);
            }
            catch(Exception x)
            {
            }
        }
        else if ( fib.equals("throw") ) {
            log.error("LogError - Couch potato ~ error message",
                      new ServletException("ServletException - Couch potato ~ fatal message"));
//            throw new ServletException("ServletException - Couch potato ~ fatal message");
            pw.println("<html>");
            pw.println("<head><title>Fibonacci</title></title>");
            pw.println("<body>");
            pw.println("<h1>Generating Fibonacci .... Normal------ " + "</h1>");
            pw.println("</body></html>");
            pw.close();
            return;
        }
        else if ( fib.equals("logError") ) {
            pw.println("<html>");
            pw.println("<head><title>Fibonacci</title></title>");
            pw.println("<body>");
            pw.println("<h1>Generating Fibonacci .... Normal------ " + "</h1>");
            pw.println("</body></html>");
            pw.close();
            log.error("LogError - Couch potato ~ error message");
            return;
        }
        else if ( fib.equals("normal") ) {
            pw.println("<html>");
            pw.println("<head><title>Fibonacci</title></title>");
            pw.println("<body>");
            pw.println("<h1>Generating Fibonacci .... Normal------ " + "</h1>");
            pw.println("</body></html>");
            pw.close();
            return;
        }
        else {
            fibOf = Integer.parseInt(fib);
        }
 
        recCounter = random.nextInt(40);
        recCounter = fibOf;
        long lResult = fib(fibOf, this, req, res);

        // See what messages are intercepted and then reported back as errors.
        if( (counter % 10) == 0 ) {
            log.debug("Couch potato ~ debug message");
            log.info("Couch potato ~ info message");
            log.warn("Couch potato ~ warn message");
            log.error("Couch potato ~ error message");
            log.fatal("Couch potato ~ fatal message");
        }
        // Every 7th call should generate RuntimeException
        else if ( (counter % 7) == 0 ){
            throw new RuntimeException("Couch potato ~ fatal message");
        }

        pw.println("<html>");
        pw.println("<head><title>Fibonacci</title></title>");
        pw.println("<body>");
        pw.println("<h1>Generating Fibonacci .... Request Id = " + counter + " RecCount= " + recCounter + "</h1>");

           if( isRandom ) {
               pw.println("<h2>Fib of (Random):" +  fibOf + " is: " + lResult +"</h2>");
               if(!islocal) {
               if(isThreaded) {
                   threadedExternalURL(fib,pw);
               }
               else {
                   externalURL(fib, pw);
               }
               }

           }
           else {
               pw.println("<h2>Fib of: " + fibOf + " is: " + lResult +"</h2>");
               if(!islocal) {
               if(isThreaded) {
                   threadedExternalURL(fib,pw);
               }
               else {
                   externalURL(fib, pw);
               }
               }
           }
        pw.println("</body></html>");
        pw.close();
    }

    public void doPost( HttpServletRequest req,
                       HttpServletResponse res )
        throws ServletException, IOException
    {
        String fib = req.getParameter("fib");
        String local = req.getParameter("local");
        String threaded = req.getParameter("threaded");
        String s1 = "null";
        String s2 = "null";
        if (req != null && req.getClass() != null && req.getClass().getName() != null ) {
            s1 = req.getClass().getName();
        }
        if (res != null && res.getClass() != null && res.getClass().getName() != null ) {
            s2 = res.getClass().getName();
        }

        Map map = req.getParameterMap();
        java.util.Enumeration e = req.getParameterNames();
        String[] values = req.getParameterValues("fib");
        
        System.out.println("AGEEEEEEEEEEEEEEEEEE--------------Received a POST - " +
            " fib: " + fib +
            " local: " + local +
            " threaded: " + threaded +
            " HttpServletRequest: " + s1 +
            " HttpServletResponse: " + s2 + 
            " Map Size: " + map.size() +
            " Values: " + values.length );

    }


    public long fib(long n, FibonacciClient fibClient, HttpServletRequest req, HttpServletResponse res)
    { 
        recCounter--;
        long result = 0;

        if(recCounter==0) {
            Random random = new Random();
            log.error("Couch potato ~ RecursionCount Reached limit." + "Random: " +
                      random.nextInt(100), new RuntimeException("Couch potato"));
        }

        if (n == 0 || n == 1)
        {
            result = n;
        }
        else {
            result = fib(n - 1, fibClient, req, res) + fib(n - 2, fibClient, req, res);
        }
        
        return result;
    }

    public long fibFast(long n)
    {
        return ( n == 0 ? 0:fib2(n, 0, 1) );
    }

    public long fib2(long n, long p0, long p1 )
    {
        return ( n == 1 ? p1:fib2( n-1, p1, p0 + p1 ) );
    }
}
