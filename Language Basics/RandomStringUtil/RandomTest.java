import org.apache.commons.lang3.*;
public class RandomTest
{
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(RandomStringUtils.randomAlphanumeric(10)+"\t\t"+RandomStringUtils.randomAlphabetic(10));
		}
	}
}