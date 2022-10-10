/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 3

# Date: 09/13/2022

# Summary: Latin honors system

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Scanner;

public class LatinHonors{
	public static void calculateAward(float rate){
		if (rate < 5) System.out.println("Congratuation! You got a \"summa cum laude\".");
		else if (rate <= 15) System.out.println("Congratuation! You got a \"magna cum laude\"."); 
		else if (rate <= 30) System.out.println("Congratuation! You got a \"cum laude\".");
		else System.out.println("Nothing");
	}	

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float topRate;

		System.out.print("Enter your topRate : ");
		while(true){
			topRate = input.nextFloat();
			if(topRate > 0 && topRate <= 100) break;
			else System.out.print("Please, Enter rate between 0 to 100 : ");
		}
		
		calculateAward(topRate);
	}
}