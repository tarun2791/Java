import java.net.*;
public class Main
{
	public static void main(String args[]) throws Exception
	{
		InetAddress ia=InetAddress.getByName("www.google.co.in");
		NetworkInterface ni=NetworkInterface.getByInetAddress(ia);
		System.out.println(ni);
	}
}