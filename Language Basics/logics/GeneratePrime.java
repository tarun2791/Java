import java.io.*;
public class GeneratePrime
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Prime no. Between 1 and 100");
		int limit=Integer.parseInt(br.readLine());
		
		
		for(int i=1;i<=limit;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				isPrime=false;
				break;
			}
			
			if(isPrime)
			{
				Thread.sleep(1000);
				System.out.print("\t"+i);
			}
		}
	}
}