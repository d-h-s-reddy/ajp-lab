import java.io.*;
import java.util.*;
import java.net.*;
public class UdpReceiver {
    public static void main(String[] args) throws Exception{
        //first create a datagramsocket and then take the ip address into the datagramsocket
        DatagramSocket receiver=new DatagramSocket(8080);
        //now create a array of byte to collect the text taht is send by the cleint
        byte[] byt=new byte[1024];
        //now create the datagram packet to take the data from the client
        DatagramPacket p=new DatagramPacket(byt,byt.length);
        receiver.receive(p);
        String response=new String(p.getData());
        System.out.println("The response obtained from the client is :"+response);
        receiver.close();
    }
}
