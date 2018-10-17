package test;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import java.lang.*;

import org.apache.log4j.Logger;


public class FibonacciServer extends HttpServlet {

    static Logger log = Logger.getLogger(FibonacciServer.class);
    static int counter = 0;
    static Random random = new Random();

    public void doGet( HttpServletRequest req,
                       HttpServletResponse res )
        throws ServletException, IOException
    {
        counter++;
        String traceLogs="";

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String fib=req.getParameter("fib");

        int fibOf = 0;
        boolean isRandom = false;
        boolean isError = false;
        boolean isException = false;

        if ( fib.equals("random") ) {
            int maxNo = 40;
            fibOf = Math.abs(random.nextInt(maxNo));
            isRandom = true;
        }
        else if ( fib.equals("error") ) {
            int maxNo = 40;
//            fibOf = Math.abs(random.nextInt(maxNo));
            fibOf = 35;
//            isRandom = true;
        }
        else if ( fib.equals("stall") ) {
            int maxNo = 35;
            //fibOf = Math.abs(random.nextInt(maxNo));
            fibOf = 35;
            try{
                traceLogs = "Explicit Stall introduced";
                Thread.sleep(2*1000);
            }
            catch(Exception x)
            {
            }
        }
        else {
            fibOf = Integer.parseInt(fib);
        }
 
        long lResult = fib(fibOf);

        // See what messages are intercepted and then reported back as errors.
        if( (counter % 10) == 0 ) {
            log.debug("Couch potato ~ debug message");
            log.info("Couch potato ~ info message");
            log.warn("Couch potato ~ warn message");
            log.error("Couch potato ~ error message");
            log.fatal("Couch potato ~ fatal message");
        }
        // Every 7th call should generate RuntimeException
        else if ( (counter % 7) == 0  && !fib.equals("stall")){
            throw new RuntimeException("Couch potato ~ fatal message");
        }
        else if ( fib.equals("error") ) {
            throw new RuntimeException("Couch potato ~ EXPLICIT fatal message, as requested");
        }

        pw.println("<html>");
        pw.println("<head><title>Fibonacci</title></title>");
        pw.println("<body>");
        pw.println("<h1>Generating Fibonacci .... Request Id = " + counter + "</h1>");
        if( isRandom ) {
            pw.println("<h2>Fib of (Random):" +  fibOf + " is: " + lResult +"</h2>");
        }
        else {
            pw.println("<h2>Fib of: " + fibOf + " is: " + lResult +"</h2>");
        }
        pw.println("<h2>TraceLog: " + traceLogs +"</h2>");
        pw.println("</body></html>");
        pw.close();
    }

    public static long fib(long n)
    { 

        long result = 0;
        if (n == 0 || n == 1)
        {
            result = n;
        }
        else {
            result = fib(n - 1) + fib(n - 2);
        }

        long tmpBuffer[] = new long[(int)Math.max(1,(int)Math.min(result, 2000L))];
        long longNo = result;
        int i = 0;
        for(i=0; i < tmpBuffer.length; i++)
        {
            tmpBuffer[i] = longNo--;
        }

        longNo = 0;
        for(i=0; i < tmpBuffer.length; i++)
        {
            longNo += tmpBuffer[i];
        }
        
//        return (result + longNo);
        return result;
    }

    public static long fibFast(long n)
    {
        return ( n == 0 ? 0:fib2(n, 0, 1) );
    }

    public static long fib2(long n, long p0, long p1 )
    {
        return ( n == 1 ? p1:fib2( n-1, p1, p0 + p1 ) );
    }
}
