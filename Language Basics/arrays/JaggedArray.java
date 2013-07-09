class JaggedArray
{
	public static void main(String args[])
	{
		int jagged [][]=new int [7][];
		jagged[0]=new int[1];
		jagged[1]=new int[2];
		jagged[2]=new int[3];
		jagged[3]=new int[4];
		jagged[4]=new int[5];
		jagged[5]=new int[6];
		jagged[6]=new int[7];
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<i+1;j++)
			{
			 jagged[i][j]=i+j;
			}
			
		}
		
		for(int i=0;i<7;i++)
			{
				for(int j=0;j<i+1;j++)
				{
					System.out.print(jagged[i][j]+" ");
				}
				System.out.println();
			}
	}
}