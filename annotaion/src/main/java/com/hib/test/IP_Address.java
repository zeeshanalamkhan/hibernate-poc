package com.hib.test;
import java.net.InetAddress;
/*public class TestJava {

public static void main(String[] args) {
int i=10;

while(i++<=10){
i++; 
}
System.out.println(i);
}*/


public class IP_Address 
{
    public static void main(String args[]) throws Exception
    {
        InetAddress IP = InetAddress.getLocalHost();
        InetAddress inetAddress = InetAddress. getLocalHost();
        System.out.println("IP of my system is := "+IP.getHostAddress());
        System.out.println("Name of my system is := "+inetAddress.getHostName());
    }
}
//}
/*Using OJDBC6.jar from HARD DISK
comile file: '‪C:\\eclipse\\plugins\\ojdbc6.jar'

C:\app\Public\product\11.2.0\dbhome_1\BIN\omtsreco.exe
C:\app\ZEESHAN\product\11.2.0\dbhome_1\bin\omtsreco.exe*/
