import java.io.*;
class Prime
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean flag=false;
		System.out.println("Enter a number");
		int x=Integer.parseInt(br.readLine());
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
			flag=false;
			break;
			}
			else
			{
			flag=true;
			}
			
		}
		System.out.println("Is the Entered no Prime? "+flag);
	}
}