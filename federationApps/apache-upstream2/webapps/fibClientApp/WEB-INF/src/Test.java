package test;

import java.net.*;
import java.io.*;

import java.util.*;



public class Test {

    static int counter = 0;
    static Random random = new Random();


    public static void main(String[] args) {
        try {
        System.out.println("Hello World!"); // Display the string.

        String url = "http://localhost:8091/fibServerApp/fibServer?fib=30";

        URL oracle = new URL(url);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
        }
        catch(Exception x)
        {
            System.out.println("Caught Exception: ");
            x.printStackTrace();
        }
/*
 
        HttpClient client = new HttpClient();
//	HttpClient client = HttpClientBuilder.create().build();
	HttpGet request = new HttpGet(url);
 
	// add request header
	// request.addHeader("User-Agent", USER_AGENT);
	HttpResponse response = client.execute(request);
 
	System.out.println("Response Code : " 
                + response.getStatusLine().getStatusCode());
 
	BufferedReader rd = new BufferedReader(
		new InputStreamReader(response.getEntity().getContent()));
 
	StringBuffer result = new StringBuffer();
	String line = "";
	while ((line = rd.readLine()) != null) {
		result.append(line);
	}
*/
    }
}
