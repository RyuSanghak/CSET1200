/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 4

# Date: 09/21/2022

# Summary: print birthday formatted as MM-DD-YYYY

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Scanner;

public class Birthday{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		StringBuffer date = new StringBuffer();

		System.out.print("Enter your birthday(MMDDYYYY) : ");
		date.append(input.nextLine());
		while(date.length() != 8){
			date.setLength(0);
			System.out.print("Please enter your birthday in a right format (MMDDYYYY): ");
			date.append(input.nextLine());
		}
		date.insert(2,"-");
		date.insert(5,"-");

		System.out.println(date);
	}
}