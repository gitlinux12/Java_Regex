package userRegisteration;

import java.util.regex.Pattern;

public class PasswardWithOneUpperCaseAndNoAndSpecialChar {
	
	public static void  main(String[] args) {
		String passwardRegex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
		String passward = "aarna09@Vivaan";
		boolean result = Pattern.matches(passwardRegex, passward);
		
		System.out.println(result);
	}

}
