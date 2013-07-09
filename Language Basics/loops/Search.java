import java.io.*;
class Search
{
	public static void main(String args[]) throws IOException
	{
		int a[]={1,2,3,2,6,7,5,7,8,7,445,78,56,54};
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a value to search");
		int val=Integer.parseInt(br.readLine());
		boolean found=false;
		int pos=0;
		for(int t:a)
		{
			pos++;
			if(t==val)
			{
				found=true;
				break;
			}
		}
		if(found)
		System.out.println("Element found at position "+pos);
		else
		System.out.println("Element not found");
		
	}
}