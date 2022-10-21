/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 8

# Date: 10/19/2022

# Summary: The program display the number of employee and the total number of hour they work.

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
		int numOfWorker=0;

		System.out.print("Enter the number of empolyee in an organization : ");
		numOfWorker = input.nextInt();
		input.nextLine();

		String employees[][] = new String[numOfWorker][2];

		System.out.println("There are "+numOfWorker+" employees.");
		System.out.println("You should enter the Information of "+numOfWorker+" employees.");
		for(int i=0; i<numOfWorker; i++){
			System.out.print("Enter the empolyee name : ");
			employees[i][0] = input.nextLine();
			System.out.print("Enter the number of hour, s(he) worked during this week : ");
			employees[i][1] = input. nextLine();
			System.out.println((numOfWorker - (i+1)) +" employees left.");
		}
		System.out.println();

		for(int i=0; i<numOfWorker; i++){
			System.out.println(i+1);
			System.out.println("name : " + employees[i][0]);
			System.out.println("Hour : " + employees[i][1] +"\r\n");

		}



	}
}