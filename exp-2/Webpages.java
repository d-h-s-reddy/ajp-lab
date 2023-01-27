import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
public class Webpages {
    public static void main(String[] args)throws Exception{
        URL webpage=null;
        URLConnection conn=null;
        webpage =new URL("https://google.com");
        conn=webpage.openConnection();
        InputStreamReader reader=new InputStreamReader(conn.getInputStream(),"UTF8");
        BufferedReader buffer=new BufferedReader(reader);
        String line="";
        while(true){
            line=buffer.readLine();
            if(line!=null){
                System.out.println(line);
            }
            else{
                break;
            }
        }
    }
}
