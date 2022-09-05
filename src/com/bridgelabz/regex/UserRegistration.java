package com.bridgelabz.regex;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * purpose : User registration program to ensure all validations
 * @uthor : Amol
 * since : 2022/09/05
 */
public class UserRegistration {

	static Scanner sc = new Scanner(System.in);
	/*
	 * UC1 : as a user need to enter valid first name
	 * first name start with capital letters and has minimum 3 characters
	 */
	public static void validFirstName() {
	
		System.out.println("enter your first name");
		String firstName = sc.next();
	    boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}",firstName);
        if(result)
			System.out.println(firstName+" is a Valid First Name");
		else
			System.err.println(firstName+" is an Invalid First Name");
	}
	
public static void main(String[] args) {
	System.out.println("*** welcome to user registration program ***");	
		validFirstName();
	}

}


