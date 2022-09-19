package com.greatlearning.itsupport.service;

import java.util.Scanner;

import com.greatlearning.itsupport.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		String department = "";
		Employee employee = new Employee("Harshit", "Choudary");
		Service service = new Service();

		employee.getFirstName();
		employee.getLastName();

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the department from the following.\n" + "1. Technical\n"
				+ "2. Administration \n" + "3. Human Resource \n" + "4. Legal\n");

		System.out.println();

		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			department = "tech";
			break;
		}
		case 2: {
			department = "admin";
			break;
		}
		case 3: {
			department = "hr";
			break;
		}
		case 4: {
			department = "legal";
			break;
		}

		}

		service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), department);
		service.showCredentials(employee);
		sc.close();
	}

}
