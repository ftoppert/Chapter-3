package exercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double x;
double y;

Scanner Input= new Scanner(System.in);
System.out.println( "Insert a number >>>");
x= Input.nextDouble();
System.out.println( "Insert a number >>>");
y= Input.nextDouble();
computePercent(x, y);

	}
	public static void computePercent(double x, double y) { 
		double compute;
		compute = (x / y)*100;
		System.out.println(x + " divided by " + y +" = " + compute + "%");
		
		

	}

}
