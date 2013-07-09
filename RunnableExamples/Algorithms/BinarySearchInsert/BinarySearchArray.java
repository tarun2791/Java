public class BinarySearchArray
{
	private long a[];
	private int nElement;
	public BinarySearchArray(int max)
	{
		a=new long[max];
		nElement=0;
	}
	public int size()
	{
		return nElement;
	}
	public int find(long searchKey)
	{
		return recFind(searchKey, 0, nElement-1);
	}
	public int recFind(long searchKey, int lowerbound, int upperbound)
	{
		int mid;
		mid=(lowerbound+upperbound)/2;
		if(a[mid]==searchKey)
		{
			return mid;
		}
		else if(lowerbound>upperbound)
		{
			return nElement;
		}
		else
		{
			if(a[mid]<searchKey)
			{
				return recFind(searchKey, mid+1, upperbound);
				
			}
			else
			{
				return recFind(searchKey, lowerbound, mid-1);
			}
		}
	}
	
	public void insert(long value)
	{
		int j;
		for(j=0;j<nElement;j++)
		{
			if(a[j] > value)
			{
				break;
			}
	
			for(int k=nElement;k>j;k--)
			{
				a[k]=a[k-1];
				a[j]=value;
				nElement++;
			}
		}
	}
	public void display()
	{	int j;
		for(j=0;j<nElement;j++)
		{
			System.out.print(a[j]+"  ");
			
			
		}
		System.out.println("abc"+a[j]);
	}
	public static void main(String args[])
	{
		BinarySearchArray arr=new BinarySearchArray(20);
		arr.insert(12);
		arr.insert(20);
		arr.insert(35);
		arr.insert(434);
		arr.insert(54);
		arr.insert(69);
		arr.insert(5);
		arr.insert(8);
		
		arr.display();
		 int searchKey = 27; // search for item
    if (arr.find(searchKey) != arr.size())
      System.out.println("Found " + searchKey);
    else
      System.out.println("Can't find " + searchKey);
		
	}
}