 import java.net.*;
 public class Main
 {
	public static void main(String args[])
	{
		try
		{
			InetAddress ia=InetAddress.getByName("74.125.236.23");
			System.out.println(ia.getHostName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
 }