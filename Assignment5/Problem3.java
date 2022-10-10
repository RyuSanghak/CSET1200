/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 5

# Date: 09/30/2022

# Summary: nested for loop

This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Scanner;

public class Problem3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int monster[] = {1000, 2000, 3000};
		int damage;

		System.out.println("Game Start... Good Luck");


		for(int i=0; i<3; i++){
			System.out.printf("Monster%d is detecting you...\r\n",i+1);

			try {
            	Thread.sleep(3000);
        	} catch (InterruptedException e) {
            	e.printStackTrace();
        	}

			System.out.printf("Monster%d detected you!\r\n",i+1);
			System.out.println("You can hit 3 times");

			for(int j=0; j<3; j++){
				System.out.print("Enter your damage! :");
				damage = input.nextInt();
				monster[i] -= damage;
				System.out.println("Monster rest HP : " + monster[i]);

				if(monster[i] < 0) break;
			}	

			if (monster[i] <= 0) System.out.println("You win! ");
			else {
				System.out.println("You lose.. game over");
				break;
			}
		}
		System.out.println("Congratulation! Killed All Monster.");
		System.out.println("Game Over..");
	}
}