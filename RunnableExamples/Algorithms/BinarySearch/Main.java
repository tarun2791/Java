public class Main
{
	public static void main(String args[])
	{
		double [] x={-2.3,4,5.5,6,8,12.67,34,5};
		double value=99;
		
		//set the lower and upper bounds
		int lower=0;
		int upper=x.length-1;
		int middle=0;
		int position=0;
		while(lower<upper)
		{
			middle=(upper+lower)/2;
			if(value>x[middle])
			{
				lower=middle+1;
				position++;		
			}
			else if(value<x[middle])
			{
				upper=middle-1;
				position++;
			}
			else
			{
				break;
			}
		}
		if(lower>upper)
		{
			System.out.println("Not Found");
		}
		else
		{
			
			System.out.println("Found at :"+position+" position");
		}
	}
}