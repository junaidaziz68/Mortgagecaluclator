package com.qa.mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgagecalc {

	public static void main(String[] args) {

		final double years = 12;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Initial amount");
		double principal = scanner.nextDouble();

		System.out.println("Enter annual interest rate:");
		float annualInterestRate = scanner.nextFloat();

		System.out.println("Enter the term in years:");
		int termOfYears = scanner.nextInt();

		float monthlyInteresrRate = (float) (annualInterestRate / years);
		int numberOfPayments = (int) (termOfYears * years);

		double monthlyPayment = principal
				* (monthlyInteresrRate * (Math.pow(1 + monthlyInteresrRate, numberOfPayments)))
				/ ((Math.pow(1 + monthlyInteresrRate, numberOfPayments)) - 1);

		System.out.println("Mortgage");
		System.out.println("------------------");
		System.out.println("Monthly payment:" + NumberFormat.getCurrencyInstance().format(monthlyPayment));

		System.out.println("Payment Schedule:");

		/*
		 * double paymentSchedule = principal * (Math.pow(1 + monthlyInteresrRate,
		 * numberOfPayments)) - (Math.pow(1 + monthlyInteresrRate, monthlyPayment) /
		 * Math.pow(1 + monthlyInteresrRate, numberOfPayments) - 1);
		 */

	}

}
