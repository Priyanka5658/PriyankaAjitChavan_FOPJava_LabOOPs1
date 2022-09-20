package com.greatlearning.test;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import com.greatlearning.service.CredentialServiceImpl;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee employee =new Employee("Sam", "George");
		CredentialService cs = new CredentialServiceImpl();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Enter the department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		String deptName = "gen";
		switch(option) {
		case 1:
			deptName="tech";
			break;
		case 2:
			deptName="adm";
			break;
		case 3:
			deptName="hr";
			break;
		case 4:
			deptName="lg";
			break;
			default:
				System.out.println("Enter valid option");
				break;
			
		}
		
		generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(), deptName);
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
		
		sc.close();
		}
	
}
