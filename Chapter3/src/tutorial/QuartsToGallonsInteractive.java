package tutorial;

import java.util.Scanner;

public class QuartsToGallonsInteractive 
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int quartsNeeded1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter quarts needed>>>");
		quartsNeeded1 = input.nextInt();
		displayConversion(quartsNeeded1);
	}

	private static void displayConversion(int quartsNeeded1) {
		final int quartsInGallons = 4;
		int gallonsNeeded;
		int extraQuarts;
		gallonsNeeded = quartsNeeded1 / quartsInGallons;
		extraQuarts = quartsNeeded1 % quartsInGallons;		
		System.out.println("You have " + gallonsNeeded + " gallons and " 
		+ extraQuarts + " quarts left over");
		
	}
}