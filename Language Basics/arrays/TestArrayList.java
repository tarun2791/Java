import java.util.*;
import java.io.*;
class TestArrayList
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String element;
		ArrayList<String> lst=new ArrayList<String>();
		System.out.println("Enter elements");
		for(int i=1;i<=10;i++)
		{
			element=br.readLine().trim();
			lst.add(element);
		}
		
		//for(int i=0;i<10;i++)
		//{
			System.out.println("Enter the index of Emlement to be extracted");
			int n=Integer.parseInt(br.readLine());
			//if(i==3||i==6||i==8)
			
			System.out.println(lst.get(n-1));
		//}
		
	}
	
}