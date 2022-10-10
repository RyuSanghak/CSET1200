/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 5

# Date: 09/30/2022

# Summary: enter some integer, input sum, average, and least integer

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Scanner;

public class Problem2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int value;
		int leastvalue = 0;
		int sum = 0;
		int count = 0;

		while(count < 5){
			System.out.printf("Enter the integer (%d more!) : ",5-count);
			value = input.nextInt();
			sum += value;
			count++;
			if (count == 1) leastvalue = value;
			else if (leastvalue > value) leastvalue = value;

		}

		System.out.println("The sum of all the integers entered: " + sum);
		System.out.println("The least integer entered: " + leastvalue);
		System.out.println("The average of all the integers entered: " + sum/count);
	}
}