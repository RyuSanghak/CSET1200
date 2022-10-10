/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 5

# Date: 09/30/2022

# Summary: enter integer and show value

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Scanner;

public class Problem1{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int value;

		while(true){
			System.out.print("Enter the integer value (-1 for end) : ");
			value = input.nextInt();

			if(value != -1) System.out.println(value);
			else {
				System.out.println("The program has detected a sentinel value of -1. Adios!");
				break;
			}

		}

	}
}