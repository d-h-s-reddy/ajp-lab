import java.net.*;
public class HostAddress {
    public static void main(String[] args) throws Exception{
        InetAddress ip=InetAddress.getByName("localhost");
        String ipaddr=ip.getHostAddress();
        String ipname=ip.getHostName();
        System.out.println("The Host Name is:"+ipname);
        System.out.println("The Host Address is:"+ipaddr);
    }
}
