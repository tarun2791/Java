public class Stars{
	public static void main(String args[])
	{
		int c=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=c;k++)
			{
				if(k%2==0)
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print("*");
				}
			}System.out.println();c+=2;
		}
	}
}