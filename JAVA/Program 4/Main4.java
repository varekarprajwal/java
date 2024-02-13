import java.net.InetAddress;
 public class Main4 {
 public static void main(String[] args) {
 try{
 InetAddress myip=InetAddress.getLocalHost();
 System.out.println("ip address:" +myip.getHostAddress() +"\t host name:" +myip.getHostName());
 InetAddress ip=InetAddress.getByName("www.youtube.com");
 System.out.println("ip address:" +ip.getHostAddress() +"\t host name:" +ip.getHostName());
 }
 catch(Exception E) {
 System.out.println(E.getMessage());
}
}
}