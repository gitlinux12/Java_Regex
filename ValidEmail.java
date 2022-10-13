package userRegisteration;

import java.util.regex.Pattern;

public class ValidEmail {
	
	public static void  main(String[] args) {
		String firstNameRegex = "^[a-z]{3,}.*[a-z]*@[a-z]*[a-z]{2}.[a-z]{2}.*[a-z]*$";
		String FirstName = "abc@gmail.in";
		boolean result = Pattern.matches(firstNameRegex, FirstName);
		
		System.out.println(result);
	}

}