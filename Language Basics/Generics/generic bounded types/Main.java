class Calculator<T extends Number>
{
	T[] nums;
	Calculator(T[] o)
	{
		nums=o;
	}
	
	double average()
	{
		double sum=0.0;
		for(int i=1;i<nums.length;i++)
		{
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
	}
}

public class Main
{
		public static void main(String args[])
		{	
			Integer nums[]={1,2,3,4,5};
			Calculator<Integer> calc=new Calculator<Integer>(nums);
			double result=calc.average();
			System.out.println("The average is : "+result);
		}
}