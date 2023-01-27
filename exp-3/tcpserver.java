import java.net.*;
import java.io.*;
import java.util.*;
public class tcpserver {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        ServerSocket ss=new ServerSocket(5050);
        System.out.println("Server is running");
        System.out.println("connecting to the client");
        Socket s=ss.accept();
        System.out.println("client is connected");

        OutputStreamWriter o=new OutputStreamWriter(s.getOutputStream());
        PrintWriter p=new PrintWriter(o);
        System.out.println("Enter a message to send to the client");
        p.println(sc.nextLine());
        p.flush();
        s.close();
    }
}
