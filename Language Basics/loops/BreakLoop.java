class BreakLoop
{
	public static void main(String args[]) throws InterruptedException
	{
		int n=10,p=0;
		for(int i=0;i<6;i++)
		{
		    
			System.out.print("Pass "+i+" : ");
		
			for(int j=p;j<n;j++)
			{
				System.out.print(" "+j+" ");
				Thread.sleep(500);
			}
			n+=10;
			p+=10;
			System.out.println();
		}
	}
}