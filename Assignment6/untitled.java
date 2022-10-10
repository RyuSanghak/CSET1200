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
  Scanner input = new Scanner(System.in);
  private String name, title, employeeID;
  private int salary, num, num2;
  private boolean flag = true;

  public String getName(){
    return name;
  }
  public void setName(String newName){
    name = newName;
  }

  public String getTitle(){
    return title;
  }
  public void setTitle(String newTitle){
    title = newTitle;
  }

  public String getID(){
    return title;
  }
  public void setID(String newID){
    employeeID = newID;
  }

  public int getSalary(){
    return salary;
  }
  public void setSalary(String newSalary){
    salary = newSalary;
  }

  public static void printProfile(){
    System.out.Println("Print employee profile");
    System.out.Println("Name : " + getName() + "\r\n" + "Title : " + getTitle() + "\r\n" + "ID : " + getID() + "\r\n" + "Annual Salary : " + getSalary());
  }

  public static void makeProfile(){
    System.out.pinrt("Enter employee name : ");
    setName(input.nextString());
    System.out.pinrt("Enter employee title : ");
    setTitle(input.nextString());
    System.out.pinrt("Enter employee ID : ");
    setID(input.nextString());
    System.out.print("Enter employee salary :");
    setSalary(input.nextInt());
  }

  public static void changeInfo(){
    System.out.println("Please enter case number what you want change");
    System.out.println("1. Name\r\n2. Title\r\n3. ID\r\n4. Salary");
    num2 = input.nextInt();
    System.out.Println("Enter value to change : ");
    switch(num2){
      case 1: setName(input.nextString());
        System.out.println("Name changed to" + getName());
        break;
      case 2: setTitle(input.nextString());
        System.out.println("Title changed to" + getTitle());
        break;
      case 3: setID(input.nextString());
        System.out.println("ID changed to" + getID());
        break;
      case 4: setSalary(input.nextInt());
        System.out.println("Salary changed to" + getSalary());
        break;
      default: System.out.println("Doesn't choice case number, go back to main");
        break;
    }
  }

  public static void main(String[] args){

    while(flag){
      System.out.Println("1. make new employee profile.\r\n2. Show employee profile.\r\n3. Change profile information.\r\n4.Close system.");
      System.out.Print("Please enter the case number what you want");
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
        case default: System.out.println("Please Enter the case number.");
      }

    }

  }
}