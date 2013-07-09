import java.net.*;
import java.io.*;
public class Main
{
	public static void main(String args[]) throws Exception
	{
			URLConnection conn=new URL("http://google.com").openConnection();
			conn.setDoInput(true);
			conn.setRequestProperty("Authorization", "asdfg");
			conn.connect();
			InputStream is=conn.getInputStream();
	}
}