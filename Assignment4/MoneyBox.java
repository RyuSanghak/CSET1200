/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 4

# Date: 09/21/2022

# Summary: print coin amount in dollar

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Scanner;

public class MoneyBox{
	public static void coinAmount(int dimes,int nickels,int pennies, int quarters){
		float dollarAmount;

		dollarAmount = ((dimes*10) + (nickels*5) + (pennies) + (quarters*25));
		System.out.println(String.format("$ %.2f",dollarAmount/100));
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int dimes, nickels, pennies, quarters;

		System.out.print("Enter the number of dimes : ");
		dimes = input.nextInt();
		System.out.print("Enter the number of nickels : ");
		nickels = input.nextInt();
		System.out.print("Enter the number of pennies : ");
		pennies = input.nextInt();
		System.out.print("Enter the number of quarters : ");
		quarters = input.nextInt();

		coinAmount(dimes, nickels, pennies, quarters);
	}
}