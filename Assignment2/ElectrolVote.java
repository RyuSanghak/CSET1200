/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 2

# Date: 09/06/2022

# Summary: asks an election official to enter the number of electoral votes received by each of the two candidates

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Scanner; // call Scanner class

public class ElectrolVote{ // name of class
	public static void main(String[] args){ // main method
		Scanner input = new Scanner(System.in); // make scanner object
		int cA, cB; // variable of candidate A and B

		while(true){ // infinit loop until input number less than 538
			System.out.print("Enter the electoral votes received by candidate A (votes cannot be more than 538). : ");
			cA = input.nextInt(); // input number to cA variable
			if(cA > 538) System.out.println("Votes cannot be more than 538."); // printout if input number bigger than 538
			else break;  // end loop condition
		}
		while(true){ // infinit loop until input number less than 538
			System.out.print("Enter the electoral votes received by candidate B (votes cannot be more than 538). : ");
			cB = input.nextInt(); // input number to cB variable
			if(cB > 538) System.out.println("Votes cannot be more than 538."); // printout if input number bigger than 538
			else break; // end loop condition
		}

		System.out.println(); // make an empty line
		System.out.println("Candidate A = " + cA + " votes."); // printout number of votes
		System.out.println("Candidate B = " + cB + " votes."); // printout number of votes

		input.close(); // close scanner object

	}
}