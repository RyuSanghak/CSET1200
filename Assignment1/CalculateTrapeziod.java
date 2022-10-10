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

# Date: August.29 2022

# Summary: To calculate the height of a trapeziod
*/

public class CalculateTrapeziod{ // name of class
	public static double calculateHeight(double area, double base1, double base2){ // method to calclate Hegith
		double height; // make a variable which get the height value
		height = area/(base1+base2); // calculate the height with parameter 
		return height; // return the variable value
	}
	public static void main(String [] args){
		double height; // make a variable which get the height value 

		height = calculateHeight(38.5, 5, 6); // input the argument (area, base1, base2) and get a height value from "calculateHeight" method

		System.out.println("Height is : " + height); // print out the height value on console

	}
}