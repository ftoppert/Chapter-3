package exercises;

import java.util.Scanner;

public class FahrenheittoCelcisiusConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temp;
		Scanner inputDevice= new Scanner(System.in);
		System.out.println("what is the temp at 8?"); 
		temp = inputDevice.nextDouble();
		displayTemp(temp, 8);
		System.out.println("what is the temp at 12?"); 
		temp = inputDevice.nextDouble();
		displayTemp(temp, 12);
		System.out.println("what is the temp at 5?"); 
		temp = inputDevice.nextDouble();
		displayTemp(temp, 5);
	}
		public static void displayTemp(double temp, int time)
		{
		double celcius;
		celcius = (temp - 32)/1.8;
		System.out.print("The temp is Celcius at " + time +" is " + celcius);
		}

}
