import java.io.*;

public class NumberLogic
{
		public static void main(String args[]) throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int sum=0;
			String str="";
			String rev="";
			int digit=0;
			System.out.println("Enter a three digit number");
			
			String input=br.readLine();
			int num=Integer.parseInt(input);
			int n=input.length();
			for(int j=0;j<3;j++)
			{
				for(int i=0;i<n;i++)
				{
					digit=num%10;
					sum+=digit;
					str+=digit+"+";
					num/=10;
					
							
				}
				num=sum;
				
				
				for(int i=str.length()-1;i>=0;i--)
				{
					rev+=str.charAt(i);
				}
				System.out.println(rev.substring(1,rev.length()));
				str="";
				rev="";
				sum=0;
				n--;
			
			}			
			
		
		
			
		}
}