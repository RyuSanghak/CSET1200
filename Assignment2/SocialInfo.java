/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 2

# Date: 09/05/2022

# Summary: input own Social Info and output Info

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

// 1 lbs , 0.453592 kg

import java.util.Scanner; // call Scanner class

public class SocialInfo{ // name of class

	public static double LBS_TO_KGS(double pounds){ // method to transfer LBS to KGS
		return pounds * 0.453592;  // return value 
	}

	public static void main(String[] args){ // main method
		Scanner input = new Scanner(System.in); // make scanner object
		double weightKilo = 0; // declare variable 

		System.out.print("Please Enter your SSN : "); // printout 
		String ssn = input.nextLine(); // get String value from input
		System.out.print("Please Enter your age : "); // printout
		int age = input.nextInt(); // get int value from input
		System.out.print("Please Enter your weight in pound : "); // printout
		double weightPound = input.nextDouble(); // get double value from 

		weightKilo = LBS_TO_KGS(weightPound); // use method and get weight value 

		System.out.println("Hi. Your SSN is " + ssn + "."); // printout ssn number
		System.out.println("You are " + age + " years old."); // printout age 
		System.out.printf("Your weight of %d pounds is equivalent to %.2f Kilograms.",(int)weightPound,weightKilo); // printout pounds and kilo weight

		input.close(); // close canner object
	}

}
