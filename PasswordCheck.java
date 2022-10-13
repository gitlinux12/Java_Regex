package userRegisteration;
import java.util.regex.Pattern;

public class PasswordCheck {
	public static void  main(String[] args) {
		String passwardRegex = "^[a-zA-Z]{8,}$";
		String passward = "abcddghjj";
		boolean result = Pattern.matches(passwardRegex, passward);
		
		System.out.println(result);
	}
	}


