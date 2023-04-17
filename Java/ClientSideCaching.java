import java.net.*;
import java.io.*;

public class ClientSideCaching {
   public static void main(String[] args) throws Exception {
      String url = "http://www.example.com";
      HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
      con.setRequestMethod("GET");
      con.setUseCaches(true);
      con.connect();

      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();
      while ((inputLine = in.readLine()) != null) {
         response.append(inputLine);
      }
      in.close();

      System.out.println(response.toString());
   }
}

// In Java, client-side caching can be implemented using the java.net package, which provides classes for working with network connections. The following code snippet demonstrates how to use the HttpURLConnection class to perform a GET request and cache the response:

// the setUseCaches method is used to enable caching for the connection. This tells the connection to use any cached response if available instead of making a new request to the server.
