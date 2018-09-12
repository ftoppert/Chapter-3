package tutorial;
// InchesToFeetInteractive.java

import java.util.Scanner;
class InchesToFeetInteractive
{    
  public static void main(String[] args) 
//TODO Auto-generated method stub
  {  
	    int inches;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter inches >> ");
	     inches = input.nextInt();
		displayConversion(inches);
  }
 	private static void displayConversion (int inchesNeeded) {
     final int INCHES_IN_FOOT = 12;
 
     int feet;
     int inchesLeft = 0;
	feet = inchesLeft / INCHES_IN_FOOT;
     inchesLeft = inchesLeft % INCHES_IN_FOOT;
     System.out.println(inchesLeft + " inches is " +
        feet + " feet and " + inchesLeft + " inches"); 
  }
}