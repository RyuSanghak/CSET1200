/*
# Name : Sanghak Ryu

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 6

# Date: 10/04/2022

# Summary: Enter the employee details and it can change details again.

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

public class Problem1{
  public static Scanner input = new Scanner(System.in);
  private static String name, title, employeeID;
  private static int salary;

  public static void printProfile(){
    System.out.println("Print employee profile");
    System.out.println("Name : " + name + "\r\n" + "Title : " + title + "\r\n" + "ID : " + employeeID + "\r\n" + "Annual Salary : " + salary);
  }

  public static void makeProfile(){
    input.nextLine();
    System.out.print("Enter employee name : ");
    name = input.nextLine();
    System.out.print("Enter employee title : ");
    title = input.nextLine();
    System.out.print("Enter employee ID : ");
    employeeID = input.nextLine();
    System.out.print("Enter employee salary :");
    salary = input.nextInt();
  }

  public static void changeInfo(){
    int num;

    System.out.println("Please enter case number what you want change");
    System.out.println("1. Name\r\n2. Title\r\n3. ID\r\n4. Salary");
    num = input.nextInt();
    input.nextLine();
    System.out.print("Enter value to change : ");
    switch(num){
      case 1: name = input.nextLine();
        System.out.println("Name changed to : " + name);
        break;
      case 2: title = input.nextLine();
        System.out.println("Title changed to : " + title);
        break;
      case 3: employeeID = input.nextLine();
        System.out.println("ID changed to : " + employeeID);
        break;
      case 4: salary = input.nextInt();
        System.out.println("Salary changed to : " + salary);
        break;
      default: System.out.println("Doesn't choice case number, go back to main");
        break;
    }
  }

  public static void main(String[] args){
    boolean flag = true;
    int num;

    while(flag){
      System.out.println("1. make new employee profile.\r\n2. Show employee profile.\r\n3. Change profile information.\r\n4. Close system.");
      System.out.print("Please enter the case number what you want : ");
      num = input.nextInt();

      switch(num){
        case 1: makeProfile();
          break;
        case 2: printProfile();
          break;
        case 3: changeInfo();
          break;
        case 4: flag = false;
          break;
        default: System.out.println("Please Enter the case number.\r\n");
      }

    }

  }
}