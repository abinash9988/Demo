import java.io.*;
import java.net.*;
class Clint1
{
   public static void main(String args[])throws Exception
{
    Socket s=new Socket("Server_ip_address",567);
    InputStream obj=s.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(obj));
    String str;
    while((str=br.readLine())!=null)
{
  System.out.println(str);
}
br.close();
s.close();
}
}
