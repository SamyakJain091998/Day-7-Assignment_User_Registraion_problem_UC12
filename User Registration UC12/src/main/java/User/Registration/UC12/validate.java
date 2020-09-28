package User.Registration.UC12;
import java.util.regex.*;

import java.util.*;

public class validate {
	
	private String message;
	
	public validate(String message) {
		this.message = message;
	}
	
	public validate() {
		
	}
	
//	first name validation
	public  boolean isValidFirstName(String msg) 
	{ 
		String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(msg); 
		return m.matches(); 
	} 
	
	public boolean validateFirstName(String message) throws ExceptionClass {
		this.message = message;
		return validateFirstName();
	}
	
	public  boolean validateFirstName() throws ExceptionClass{
		validate val = new validate();
		boolean ans = val.isValidFirstName(message);
		if(ans == true) {
			return ans;
		}else {
			throw new ExceptionClass("Invalid Entry");
		}
	}
//	last name validation
	public  boolean isValidLastName(String msg) 
	{ 
		String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(msg); 
		return m.matches(); 
	} 
	
	public  boolean validateLastName(String message) throws ExceptionClass{
		this.message = message;
		return validateLastName();
	}
	
	public  boolean validateLastName() throws ExceptionClass{
		validate val = new validate();
		boolean ans = val.isValidLastName(message);
		if(ans == true) {
			return ans;
		}else {
			throw new ExceptionClass("Invalid Entry");
		}
	}
	
// Phone number validation
	public  boolean isValidMobileNumber(String msg) 
	{ 
		String regex = "^[1-9]{1}[0-9]{1}\\s{1}[1-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(msg); 
		return m.matches(); 
	} 
	
	public boolean validateMobileNumber(String message) throws ExceptionClass{
		this.message = message;
		return validateMobileNumber();
		}
	
	public boolean validateMobileNumber() throws ExceptionClass{
		validate val = new validate();
		boolean ans = val.isValidMobileNumber(message);
		if(ans == true) {
			return ans;
		}else {
			throw new ExceptionClass("Invalid Entry");
		}
	}
	
//email validation
	public  boolean isValidEmail(String msg) 
	{ 
		String regex = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(msg); 
		return m.matches(); 
	} 
	
	public  boolean validateEmail(String message) throws ExceptionClass{
		this.message = message;
		return validateEmail();
		}
	
	public  boolean validateEmail() throws ExceptionClass{
		validate val = new validate();
		boolean ans = val.isValidEmail(message);
		if(ans == true) {
			return ans;
		}else {
			throw new ExceptionClass("Invalid Entry");
		}
	}
//	password validation
	public  boolean isValidPassword(String msg) 
	{ 

		String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*\\W)[a-zA-Z0-9\\@\\_\\-\\+\\#\\*]{8,}$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(msg); 
		return m.matches(); 
	} 
	
	public boolean validatePassword(String message) throws ExceptionClass {
		this.message = message;
		return validatePassword();
	}
	
	public  boolean validatePassword() throws ExceptionClass{
		validate val = new validate();
		boolean ans = val.isValidPassword(message);
		if(ans == true) {
			return ans;
		}else {
			throw new ExceptionClass("Invalid Entry");
		}
	}
}
