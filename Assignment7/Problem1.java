/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 7

# Date: 10/14/2022

# Summary: sum of all the elements of an array of ints that have an even index

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

public class Problem1{
	public static void main(String[] args){
		int[] myList = {10,9,8,7,6,5,4,3,2,1,0,1,2,3,4,5,6,7,8,9,10};
		int sum = 0;

		for(int i=0; i<myList.length; i+=2){
			sum += myList[i];
			System.out.println("even index element: " + myList[i]);
			
		}

		System.out.println("Sum of all even index element: " + sum);
	}
}