package userRegisteration;
import java.util.regex.Pattern;

public class RegexValidLastName {
		
		public static void  main(String[] args) {
			String firstNameRegex = "^[A-Z]{1}[a-zA-z]{2,}$";
			String FirstName = "Program";
			boolean result = Pattern.matches(firstNameRegex, FirstName);
			
			System.out.println(result);
		}
}