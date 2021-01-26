import java.util.*;

/**
 * This program demonstrates a <code>for</code> loop
 * @version 1.20 2020-01-05
 * @author Kang RongJie
 */

public class LotteryOdds
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to dram? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        /*
         *compute binomial coefficient n*(n-1)*(n-2)...*(n-k+1)/(1*2*3*...k) 
         *计算组合
         */

         int LotteryOdds = 1;
         for (int i = 1; i <= k; i++)
            LotteryOdds = LotteryOdds * (n - i + 1) / i;
        System.out.println("Your odds are 1 in " + LotteryOdds + ". Good luck!");
        in.close();
    }
}