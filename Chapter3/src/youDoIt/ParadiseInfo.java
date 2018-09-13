package youDoIt;
import java.util.Scanner;
public class ParadiseInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter cutoff price for discount >> ");
		price = keyboard.nextDouble();
		System.out.print("Enter Discount rate as a whole number >> ");
		discount = keyboard.nextDouble();
		displayInfo();
		savings = computeDiscountInfo(price,discount); 
		System.out.println("Special this week on any service over " + price);
		System.out.println("Discount of" + discount + "Percent");
		System.out.println("That is a savings of at least $" + savings);
	
	}

	private static void displayInfo() {
		// TODO Auto-generated method stub
		{
		System.out.println("Paradise Day Spa wants to pamper you ");
		System.out.println("We will make you look good");
	}
}
		public static double computeDiscountInfo(double pr, double discnt) {
	
	
}
