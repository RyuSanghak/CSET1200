/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 3

# Date: 09/12/2022

# Summary: asks an election official to enter the number of electoral votes received by each of the two candidates

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Scanner; // import java utility 

public class QualifiesLoan{ // name of class

	public static void checkQualify(double LoH, double paid, int age){ // method to check laon Qualify
		double equity, persentOfEquity; // variable to get equity and persent value 
		boolean flag = false;  // boolean variable to check nothing qualify

		equity = LoH - paid; // equity = loan of house - paid

		persentOfEquity = 100 - ((equity / LoH) * 100); // calculate persent of equity in home. 

		if(persentOfEquity > 100) persentOfEquity = 100; // when the persent is over 100, make it 100% 
 
		if (age >= 62 && persentOfEquity >= 20){ // condition to check value more than 62 AND over 20%
			flag = true;  // input true value because s/he has qualify for a loan.
			System.out.println("You are qualify for a loan called \"Senior\"."); // printout loan name
		}
		if ((age >= 35 && age <= 50) || persentOfEquity >= 10){ // condition to check value, age are between 35 to 50 OR over 10%
			flag = true; // input true value because s/he has qualify for a loan.
			System.out.println("You are qualify for a loan called \"Incentive\"."); // printout loan name
		} 
		if (age < 19 || persentOfEquity >= 70){ // condition to check value, age is less than 19 OR more than 70%
			flag = true; // input true value because s/he has qualify for a loan.
			System.out.println("You are qualify for a loan called \"Hussler\"."); // printout loan name
		} 
		if (flag == false) System.out.println("You don't match qualify for any loan."); // if s/he doesn't match for any loan, print out.

	}

	public static void main(String[] args){ // main method
		Scanner input = new Scanner(System.in); // declare Scanner to use with input
		double loanOfHouse, paid, owes; // loan amount of house, how much paid, how much owes
		int age;  // user's age

		System.out.print("Please, enter your loan amount of house : ");  // printout
		loanOfHouse = input.nextDouble(); // scan what user type
		System.out.print("Please, enter your paid amount : "); // printout 
		paid = input.nextDouble(); // scan what user type 
		System.out.print("Please, enter your owes : "); // printout
		owes = input.nextDouble(); // scan what user type 
		System.out.print("Please, enter your age : "); // printout
		age = input.nextInt(); // scan what user type

		checkQualify(loanOfHouse, paid, age); // use method to check qualify 

	}
}