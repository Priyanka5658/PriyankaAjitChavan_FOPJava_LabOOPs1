package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Random;
import java.util.random.*;

public class CredentialServiceImpl implements CredentialService {
	
	public char[] generatePassword() {
		
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();
		char[] password = new char[8];
         for (int i = 0; i < 8; i++) 
        {
			
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		
		return password;
		
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+"greatlearning.com";
	}

	@Override
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear "+employee.getFirstName()+ " the generated credentials are");
		System.out.println("Email --> "+ email);
		System.out.print("Paasword --> "+ generatedPassword.toString());
		
	}
	
}
