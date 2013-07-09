enum Convertor
{
	
	DollerToEuro("Doller to Euro"){
		double convert(double value)
		{
			return value * 0.9;
		}
	},
	DollerToPound("Doller to Pound"){
		double convert(double value)
		{
			return value * 0.8;
		}
	};
	private String desc;
	Convertor(String desc)
	{
		this.desc=desc;
	}
	public String toString()
	{
		return desc;
	}
	abstract double convert(double value);
}
public class Main
{
	public static void main(String args[])
	{
		System.out.println(Convertor.DollerToEuro+" = "+Convertor.DollerToEuro.convert(100));
		System.out.println(Convertor.DollerToPound+" = "+Convertor.DollerToPound.convert(100));
	}
}