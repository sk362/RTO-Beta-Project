package com.user_define;

import java.util.Scanner;

public class RTO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your age:");

		try {
			int age = scanner.nextInt(); 
			if (age < 18) {
				throw new AgeTooLow.AgeTooLowException("Age is too low for applying for a driving license.");
			} else if (age > 70) {
				throw new AgeTooHigh.AgeTooHighException("Age is too high for applying for a driving license.");
			} else {
				System.out.println("Age is acceptable for a driving license.");
			}

		} catch (AgeTooLow.AgeTooLowException | AgeTooHigh.AgeTooHighException e) {
			e.printStackTrace();
			System.out.println(e.getMessage()); // Handle age-related exceptions
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid input! Please enter a valid number."); 
		} finally {
			scanner.close(); // Close the scanner to avoid resource leakage
		}
	}
}