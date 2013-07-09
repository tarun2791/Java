import java.util.*;

public class Numbers {

    //array containing single digits words numbers:0-9
    private final String[] SINGLE_DIGITS_WORDS;

    //array containing special words words eg:10-19
    private final String[] TEEN_DIGITS_WORDS;

    //array containing tens words numbers:20-90
    private final String[] TEN_DIGITS_WORDS;

    private int value,   //number to be converted to words
                one,     //number to store digits
                ten,     //number to store tens
                hundred, //number to store hundred
                thousand;//number to store thousand

    private String strOut;

    //conscructor: Initializing value and arrays
    public Numbers(int n)
{
}

    //getting single digit number
    private int getOnes()
    {
        one = value % 10;
        return one;
    }

    //getting tens numbers
    private int getTens()
    {
        ten = value % 100;
        ten /= 10;
        return ten;
    }

    //getting hundreds numbers
    private int getHundreds()
    {
        hundred = value % 1000;
        hundred /= 100;
        return hundred;
    }

    //getting thousands numbers
    private int getThousands()
    {
        thousand = value % 10000;
        thousand /= 1000;
        return thousand;
    }

    //converting and returning string of ones 
    private String digitsToString(int one)
    {
        return SINGLE_DIGITS_WORDS[one];        
    }

    //converting and returning strings of tens and teens
    private String tensAndOnesToString(int ten, int one)
    {
        if(ten == 1)//if number is a teen return, else return tens 
        { 
            return TEEN_DIGITS_WORDS[one];
        }
        return TEN_DIGITS_WORDS[ten-2];         
    }

    //converting and returning strings of hundreds
    private String hundredsToString(int hundred)
    {
        return digitsToString(hundred) + " hundred";
    }

    private String thousandsToString(int thousand)
    {
        return digitsToString(thousand) + " thousand";
    }
	
}