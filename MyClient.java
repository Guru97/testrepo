import java.io.*;
import java.net.*;
class MyClient
{
 public static void main(String[] args)throws Exception
 {
   String sen,nsen;
   DataInputStream in=new DataInputStream(System.in);
   Socket cs=new Socket("10.1.5.163",6789);
   DataInputStream inp=new DataInputStream(cs.getInputStream());
   DataOutputStream out=new DataOutputStream(cs.getOutputStream());
   while(true)
   {
       sen=in.readLine();
       out.writeBytes(sen+"\n");
       nsen=inp.readLine();
       System.out.println("From Server: "+nsen);
    }
  }
}