import java.util.*;

/**
 * This program demonstrates a <code>while</code> loop.
 * @version 1.20 2020-01-04
 * @author Kang RongJie
 */

 public class Retirement
 {
    public static void main(String[] args)
    {
        // read inputs
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retive? ");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double InterestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        // update account balacne while goal isn't reached
        while (balance < goal)
        {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * InterestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("You can retire in " + years + " years.");
        in.close();
    }
 }
