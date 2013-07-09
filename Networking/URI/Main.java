import java.net.*;

public class Main
{
	public static void main(String args[]) throws Exception
	{
		URI uri=new URI("http://www.java2s.com");
		System.out.println("URI :"+uri);
		System.out.println("Raw Authority : "+uri.getRawAuthority());
		System.out.println("Raw Fragment : "+uri.getRawFragment());
		System.out.println("Fragment : "+uri.getFragment());
		System.out.println("Authority : "+uri.getAuthority());
		System.out.println("Raw Query : "+uri.getRawQuery());
		System.out.println("Raw Path : "+uri.getRawPath());
		System.out.println("Scheme specific Part : "+uri.getRawSchemeSpecificPart());
		System.out.println("Raw User Info : "+uri.getRawUserInfo());
	}
}