/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 6

# Date: 10/04/2022

# Summary: The 
  system then returns the possible classification of COVID-19 above and requests
  for additional confirmatory blood tests.

#  The TA for this class is Hari Krishna (HariKrishna.Yaram@rockets.utoledo.edu).
  Please reach out to him if you have questions about the assignment.
  
# You must put this line as a comment at the top of your Java source file. 
This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.
*/

import java.util.Scanner;

public class Problem2{
  public static String classification(float fever, String[] symptoms,int count){
    String result;

    if(fever < 100.4) result = "Mild";
    else result = "Moderate";
    for(int i=0; i<count; i++){
      if(symptoms[i].equals("drop in blood pressure") || symptoms[i].equals("inflammation") || symptoms[i].equals("pneumonia")){
        result = "Severe";
        return result;
      }
      else if(symptoms[i].equals("cough") || symptoms[i].equals("chills") || symptoms[i].equals("shortness of breather") || symptoms[i].equals("tiredness")){
        result = "Moderate";
      }
    }
    return result;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String symptoms[] = new String[10];
    float fever;
    String result;
    int count = 0;

    System.out.print("Enter value of Fever : ");
    fever = input.nextFloat();
    input.nextLine();
    System.out.println("Enter the sysptom one at a time.");
    System.out.println("Enter \"end\" to stop typing");
    for(int i=0; i<10; i++){
      System.out.printf("Symptom %d : ",i+1);
      symptoms[i] = input.nextLine();
      if(symptoms[i].equals("end") || symptoms[i].equals("END") || symptoms[i].equals("End")) break;
      count++;
    }

    result = classification(fever,symptoms,count);

    System.out.println("classification : "+ result);

  }
}