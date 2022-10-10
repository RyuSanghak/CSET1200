/*
This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA or tutor for this course. I understand that getting outside help from this course 
other than from the instructor or TA or tutor  will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.  

# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 1

# Date: August.31 2022

# Summary: get an average value
*/

public class AverageClear{ // name of class 
	public static double average(double a, double b){ // method to get an average with parameter
		return (a + b) / 2; // return average value
	}

	public static void main(String [] args){ // main method
		double a = 9; // variable 
		double b = 3; // variable
		System.out.println("a = " + a); // print out 'a' value 
		System.out.println("b = " + b); // print out 'b' value
		System.out.println("average = " + average(a, b)); // print out average value
	}
}