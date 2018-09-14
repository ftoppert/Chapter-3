package exercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double gpa;
 double credit;
	Scanner inputDevice = new Scanner(System.in);
	System.out.println("Enter GPA >>>  ");
    gpa = inputDevice.nextInt();
    displayGPAToCredit(gpa); 

 
	}

	private static void displayGPAToCredit(double gpa) {
	double credit = (gpa * 10);
	System.out.println("Your credit is  " + credit);
		
	}

}
