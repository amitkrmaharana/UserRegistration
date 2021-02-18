import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void firstNameCheck(String name) { // to check if first name input matches with the provided pattern 
		String regex = "^[A-Z]{1}[a-zA-Z]{2,}$"; // 1st letter is Capital and has minimum of 3 letters
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(name);
		boolean bool = match.matches();// checks if the pattern matches with the given pattern and returns a boolean value 
		if (bool) 
			System.out.println(name + " is a valid first name");
		else
			System.out.println(name + " is not a valid first name");
	}
	public static void lastNameCheck(String name) {
		String regex = "^[A-Z]{1}[a-zA-Z]{2,}$"; // 1st letter is Capital and has minimum of 3 letters
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(name);
		boolean bool = match.matches();// checks if the pattern matches with the given pattern and returns a boolean value 
		if (bool) 
			System.out.println(name + " is a valid last name");
		else
			System.out.println(name + " is not a valid last name");
	}
	public static void emailCheck(String email) {
		String regex = "^[a-zA-Z0-9]{3,}([.]{1}+[a-zA-Z0-9]{3,})*[@]{1}[a-zA-Z0-9]{2,}[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z0-9]{2,})*$"; // abc.xyz@bl.co.in is valid with abc bl and co are mandatory 2 optional(xyz,in) with precise @ and . positions  
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(email);
		boolean bool = match.matches();// checks if the pattern matches with the given pattern and returns a boolean value 
		if (bool) 
			System.out.println(email + " is a valid email");
		else
			System.out.println(email + " is not a valid email");
	}
	public static void mobilenumberCheck(String mobile) {
		String regex = "^[9][1][\s][6-9][0-9]{9}$"; // 91 followed by space followed by 10 digit number   
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(mobile);
		boolean bool = match.matches(); 
		if (bool) 
			System.out.println(mobile + " is a valid mobile number");
		else
			System.out.println(mobile + " is not a valid mobile number");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid first name");
		String firstName = sc.nextLine();
		System.out.println("Enter a valid last name");
		String lastName = sc.nextLine();
		System.out.println("Enter a valid email");
		String email = sc.nextLine();
		System.out.println("Enter a valid mobile number starting with 91 folowwed by a space and 10 didit number");
		String mobile = sc.nextLine();
		firstNameCheck(firstName);
		lastNameCheck(lastName);
		emailCheck(email);
		mobilenumberCheck(mobile);
	}

}
