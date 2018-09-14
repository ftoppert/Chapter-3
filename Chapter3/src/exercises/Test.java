package exercises;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pounds;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Enter pounds >>>  ");
		pounds = inputDevice.nextInt();
		displayLbsToKilo(pounds); 
		displayLbsToOunces(pounds);
		displayLbsToMilli(pounds);
	}
	public static void displayLbsToKilo(double pounds) {
		double kilo ;
		kilo = (pounds  / 2.2046);
		System.out.println("Pounds to Kilo is " + kilo);
	}
	public static void displayLbsToOunces(double pounds) {
		
		double ounces;
		ounces = (pounds * 16) ;
		System.out.println("Pounds to ounces is   " + ounces );
		
	}

	public static void displayLbsToMilli(double pounds) {
		
		double milli;
		milli = (pounds / 0.0000022046);
		System.out.println("Ounds to milli is   " + milli);
	}
}