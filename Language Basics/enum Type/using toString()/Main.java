enum Token
{
	IDENTIFIER("ID"),INTEGER("INT"),LPAREN("("),RPAREN(")"),COMMA(",");
	private final String tokVal;
	Token(String tokVal)
	{
		this.tokVal=tokVal;
	}
	public String toString()
	{
		return tokVal;
	}
}
public class Main
{
	public static void main(String args[])
	{
		for(int i=0;i<Token.values().length;i++)
		{
			System.out.println(Token.values()[i].name()+" = "+Token.values()[i]);
		}
	}
}