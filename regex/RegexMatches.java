import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches
{
	
		
		public static int extractInt(String str)
	{
		
		 
		String pattern = "\\((\\d+)\\)";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher matcher = r.matcher(str);
	      if (!matcher.find( )) {
			
			 throw new NumberFormatException("for String [ "+str+" ] ");
		 }
		 return Integer.parseInt(matcher.group(1)); 
		}

    public static void main(String args[]){

     int result=extractInt("Folder 2(11)");
	 System.out.println(result);
      
   }
}