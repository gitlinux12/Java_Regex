package userRegisteration;
import java.util.regex.Pattern;
public class PasswordWithOneUpperCase {
	
		public static void  main(String[] args) {
			String passwardRegex = "^(?=.*[A-Z])[A-Za-z]{5,}$";
			String passward = "Hello";
			boolean result = Pattern.matches(passwardRegex, passward);
			
			System.out.println(result);
		}
	}

