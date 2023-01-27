import java.net.*;
import java.io.*;
import java.util.*;
public class tcpclient{
    public static void main(String[] args)throws Exception{
        System.out.println("Establishing the connection");
        Socket s=new Socket("localhost",5050);
        BufferedReader b=new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println("The message received from the server is:"+b.readLine());
        s.close();
    }
}