import java.io.*;
import java.net.*;
class MyServer
{
 public static void main(String[] args)throws Exception
 {
   String sen,nsen;
   DataInputStream in=new DataInputStream(System.in);
   ServerSocket ss=new ServerSocket(6789);
   Socket s=ss.accept();
   DataInputStream inp=new DataInputStream(s.getInputStream());
   DataOutputStream out=new DataOutputStream(s.getOutputStream());
   while(true)
   {   
       nsen=inp.readLine();
       if(nsen.matches("close"))
       s.close();
       System.out.println("From Client: "+nsen);
       sen=in.readLine();
       out.writeBytes(sen+"\n");
       
    }
  }
}