package userRegisteration;

import java.util.regex.Pattern;

public class SampleEmail {
	
	public static void  main(String[] args) {
		String passwardRegex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{2,6}))?$";
		String passward1 = "abc@yahoo.com";
		boolean result = Pattern.matches(passwardRegex, passward1);
		
		
	}

}