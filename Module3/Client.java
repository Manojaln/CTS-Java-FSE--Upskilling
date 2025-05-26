import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) {
        try (Socket com = new Socket("localhost", 12345)) {
            BufferedReader srRead = new BufferedReader(new InputStreamReader(com.getInputStream()));
            PrintWriter srWrite = new PrintWriter(com.getOutputStream(), true);
            BufferedReader usin = new BufferedReader(new InputStreamReader(System.in));
            String inputLine;
            	while ((inputLine = usin.readLine()) != null) {
                srWrite.println(inputLine);
                System.out.println("Server: " + srRead.readLine());
     }   } catch (IOException netError) {
            netError.printStackTrace();}
}
}
