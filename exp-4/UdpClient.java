import java.io.*;
import java.util.*;
import java.net.*;
public class UdpClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket client=new DatagramSocket();
        //now store teh ip address into an variable
        InetAddress ip=InetAddress.getByName("localhost");
        //now take the input from the user
        Scanner sc=new Scanner(System.in);
        String  str1=sc.nextLine();
        byte[] byt=str1.getBytes();
        //now create a datagrampacket to connect the client and the server
        DatagramPacket p=new DatagramPacket(byt, byt.length,ip,8080);
        client.send(p);
        client.close();
    }
}