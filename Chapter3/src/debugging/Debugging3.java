package debugging;
import java.util.Scanner;
public class Debugging3
{
   public static void main(String args[])
// This application gets a user's name and displays a greeting
   {
      Object name;
      Object getName = null;
	name = getName;
      displayGreeting(name);           
   }
   public static String getName()
   {
      String name;
    
	Scanner input = new Scanner(System.in);
      System.out.print("Enter name ");
      name = input.nextLine();
      return name;
   }
   public static void displayGreeting(Object name)
   {
      System.out.println("Hello, " + name + "!");
   }
}