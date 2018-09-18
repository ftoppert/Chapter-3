package debugging;
public class Debuggging1
{
   public void main(String args[])

// This class calculates a waitperson's tip as 15% of the bill
   {
      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are");
      calcTip(myCheck);
      calcTip(yourCheck);
    }
    public void calcTip(double myCheck)
    {
      final double RATE = 0.15;
      double tip;
      tip = myCheck * RATE;
      System.out.println("The tip should be at least " + tip);
    }
}
