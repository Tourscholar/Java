/**
 * This program demonstrates a triangular array
 * @version 1.20 2020-01-11
 * @author Kang RongJie
 */

public class LotterArray
{
    public static void main(String[] args)
    {
        final int MAX = 10;

        // allocate triangular array
        int[][] odds = new int[MAX + 1][];
        for (int n = 0; n <= MAX; n++)
            odds[n] = new int[n + 1];
        
        // fill triangular array
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++)
            {
                /*
                 *compute binomial coefficient n * (n - 1) * (n - 2) *...
                 (n-k+1)/(1*2*3*...*k) 
                 */
                int lotterodds = 1;
                for (int i = 1; i <= k; i++)
                    lotterodds = lotterodds * (n - i + 1) / i;
                
                odds[n][k] = lotterodds;
            }
        
        // print triangular array
        for (int[] row : odds)
        {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}