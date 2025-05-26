import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket srSocket = new ServerSocket(12345)) 
{
          System.out.println("Server started");
           Socket clSocket = srSocket.accept();
        System.out.println("Client connected.");
     	       BufferedReader in = new BufferedReader(new InputStreamReader(clSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clSocket.getOutputStream(), true);
            BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
            String inputline;
            while ((inputline = in.readLine()) != null) {
                System.out.println("Client: " + inputline);
                System.out.print("Server: ");
                String srResponse = consoleIn.readLine();
                System.out.println(srResponse);
}
} catch (IOException e) {
e.printStackTrace();
}
    }
}