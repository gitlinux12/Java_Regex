package userRegisteration;

import java.util.regex.Pattern;

public class PasswordWithOneUpperCaseAndNo {
	
	public static void  main(String[] args) {
		String passwardRegex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z\\d]{8,}$";
		String passward = "Passw12D@12";
		boolean result = Pattern.matches(passwardRegex, passward);
		
		System.out.println(result);
	}

}