/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 7

# Date: 10/14/2022

# Summary: make random value array and sort it.

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Arrays;

public class Problem2{
	public static void main(String[] args){
		int[] randomList = new int[50];
		for(int i=0; i<randomList.length; i++){
			randomList[i] = ((int)(Math.random()*(85-15+1))+15); // input random value between 15 to 85
			System.out.print(" "+randomList[i]);
		}
		
		for(int i=0; i<randomList.length; i++){ // 
			int temp; // variable to save temporarily when swap little and big value
			for(int j=i; j<randomList.length; j++){
				if(randomList[i] > randomList[j]){ // if a front value is bigger than a backward value
					temp = randomList[i];
					randomList[i] = randomList[j];  // swap
					randomList[j] = temp;
				} 
			}
		}

		//Arrays.sort(randomList);
		System.out.println();
		for(int i=0; i<randomList.length; i++){  // printout array values
			System.out.print(" "+randomList[i]);
		}
	}
}