import java.net.*;
import java.io.*;
public class Main
{
	public static void main(String args[]) throws Exception
	{
		URL url=new URL("http://google.com");
		try
		{
		InputStream is=url.openStream();
			int ch;
			while((ch=is.read())!=-1)
			{
				System.out.print((char)ch);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}