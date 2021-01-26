/**
 * This program shows how to store tabular data in a 20 array.
 * @version 1.40 2020-01-10
 * @author kang RongJie
 */

public class CompoundInterest
{
    public static void main(String[] args)
    {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYERS = 10;

        // set interest rates to 10 ... 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;
        double[][] balances = new double[NYERS][NRATES];

        // set initial balacnes to 10000
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;
        
        // compute interest for future years
        for (int i = 1; i < balances.length; i++)
        {
            for (int j = 0; j < balances[i].length; j++)
            {
                // get last year's balances from previous row
                double oldBalance = balances[i - 1][j];

                // compute interest
                double interest = oldBalance * interestRate[j];

                // compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }
        // print one row of interest rates
        for (int j = 0; j < interestRate.length; j++)
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        System.out.println();
        // print balacne table
        for (double[] row : balances)
        {
            // print table row
            for (double b : row)
                System.out.printf("%10.2f", b);
            
            System.out.println();
        }
    }
}