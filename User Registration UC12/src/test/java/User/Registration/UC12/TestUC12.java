package User.Registration.UC12;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;

public class TestUC12 {
	
	//@Ignore
	@Test
	public void when_Valid_First_Name_Returns_True() {
		try {
			System.out.println("Enter valid first name down below: ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			validate v = new validate();
			boolean firstName = v.validateFirstName(str);
			Assert.assertEquals(true, firstName);
		} catch (ExceptionClass e) {
			e.printStackTrace();
		}
	}
	
	//@Ignore
	@Test
	public void when_Valid_Last_Name_Returns_True() {
		try {
			System.out.println("Enter valid last name down below: ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			validate v = new validate();
			boolean lastName = v.validateLastName(str);
			Assert.assertEquals(true, lastName);
		} catch (ExceptionClass e) {
			e.printStackTrace();
		}
	}
	
	//@Ignore
	@Test
	public void when_Valid_Email_Returns_True() {
		try {
			System.out.println("Enter valid email id down below: ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			validate v = new validate();
			boolean email = v.validateEmail(str);
			Assert.assertEquals(true, email);
		} catch (ExceptionClass e) {
			e.printStackTrace();
		}
	}
	
	//@Ignore
	@Test
	public void when_Valid_Mobile_Number_Returns_True() {
		try {
			System.out.println("Enter valid mobile number down below: ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			validate v = new validate();
			boolean mnumber = v.validateMobileNumber(str);
			Assert.assertEquals(true, mnumber);
		} catch (ExceptionClass e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void when_Valid_Password_Returns_True() {
		try {
			System.out.println("Enter valid password down below: ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			validate v = new validate();
			boolean password = v.validatePassword(str);
			Assert.assertEquals(true, password);
		} catch (ExceptionClass e) {
			e.printStackTrace();
		}
	}
	
}
