import java.util.*;
public class Main
{
	public static void main(String args[]) throws java.io.IOException
	{
		/*char c=(char)System.in.read();
		System.out.println(c);
		*/
		List<String> l=new ArrayList<String>();
		l.add("anna");
		l.add("murugan");
		l.add("ayappa");
		
		Enumeration en=Collections.enumeration(l);
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}
}