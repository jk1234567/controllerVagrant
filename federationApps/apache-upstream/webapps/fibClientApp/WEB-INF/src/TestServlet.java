package test;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import java.net.*;

import org.apache.log4j.Logger;

public class TestServlet extends HttpServlet {

    static Logger log = Logger.getLogger(FibonacciClient.class);
    static int counter = 0;
    static Random random = new Random();
    public final Random randomGenerator = new Random();
    static int recCounter = 0;

    private static String[][] URL_REPLACE_STRINGS =
            {{"%20", " "},
                    {"%25", "%"},
                    {"%22", "\""},
                    {"%5C", "\\"},
                    {"%3A", ":"},
                    {"%2F", "/"}
            };

    public TestServlet() {
        super();
    }

    /**
     * Invoked when a Servlet POST request is received.
     * @param request the HttpServletRequest
     * @param response the HttpServletResponse
     * @exception javax.servlet.ServletException
     * @exception IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        String inputStreamString = readInputStream(request);

        String input = request.getParameter("input");
        String fib = request.getParameter("fib");

        if (input == null                                       // if we couldn't get input parameter
                && inputStreamString != null                    //      but we read the InputStream...
                && inputStreamString.length() > 0)
            input = getParameterFromInputStreamString(inputStreamString,
                    "input");

        if (input == null)
            throw new ServletException("input is null");
        else {
            response.getWriter().println("input is " + input +
                                         " ----- " + inputStreamString);
            response.getWriter().println("fib of " + input +
                                         " is " + findFib(fib));
        }
    }

    /**
     * Invoked when a Servlet GET request is received.
     * @param request the HttpServletRequest
     * @param response the HttpServletResponse
     * @exception javax.servlet.ServletException
     * @exception IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        doPost(request, response);

        pw.println("<html>");
        pw.println("<head><title>Fibonacci</title></title>");
        pw.println("<body>");
        pw.println("<h1>Generating Fibonacci .... Normal------ " + "</h1>");
        pw.println("</body></html>");
        pw.close();
        return;
    }

    /**
     * Reads the Request InputStream, and returns contents as a String
     * @param request the HttpServletRequest
     * @return a String containing the contents of the body
     * @exception IOException
     * @exception ServletException if the InputStream is empty
     */
    private String readInputStream(HttpServletRequest request) throws IOException,
            ServletException {
        String bufferAsString = null;

        byte[] bigBuffer = new byte[10000];

        ServletInputStream is = request.getInputStream();

        int numRead = is.read(bigBuffer);

        if (numRead > 0) {
            byte[] returnBuffer = new byte[numRead];

            System.arraycopy(bigBuffer,
                    0,
                    returnBuffer,
                    0,
                    numRead);

            bufferAsString = new String(returnBuffer);
        } else
            throw new ServletException("Input Stream is empty");

        return bufferAsString;
    }

    /**
     * Called when we could not get the value of a request parameter, but we have read the body of the
     * request.  The request body is parsed to obtain the value of the parameter
     * @param inputStreamString a String containing the request body
     * @param key the parameter we are looking for
     * @return the value of the parameter, edited
     */
    private String getParameterFromInputStreamString(String inputStreamString,
            String key) {
        String returnValue = null;

        String[] parsedString = inputStreamString.split("&");

        for (String nextString : parsedString) {
            String[] keyValue = nextString.split("=");

            if (keyValue.length == 2
                    && keyValue[0].equals(key)) {
                returnValue = keyValue[1];

                for (String[] nextReplaceStrings : URL_REPLACE_STRINGS)
                    returnValue = returnValue.replaceAll(nextReplaceStrings[0],
                            nextReplaceStrings[1]);

                break;
            }
        }

        return returnValue;
    }

    public long findFib(String fib) {
        try {
            long l = Long.parseLong(fib);
            return fibFast(l);
        } catch (Exception x) {
            return -9999L;
        }
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
