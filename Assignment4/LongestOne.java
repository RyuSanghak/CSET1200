/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 4

# Date: 09/21/2022

# Summary: Print the longest word

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Scanner;

public class LongestOne{
	public static void selectLong(String a, String b, String c){
		String longest;

		longest = (a.length() > b.length()) ? a : b;
		System.out.print("the length of the longer word is : ");
		longest = (longest.length() > c.length()) ? longest : c;
		System.out.println(longest);
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String a,b,c;

		System.out.print("Enter three words seperated by spaces : ");
		a = input.next();
		b = input.next();
		c = input.next();

		selectLong(a,b,c);

			
	}
}