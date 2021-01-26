import java.util.*;

/**
 * 齐肯多夫定理求斐波那契数列的贪心实现
 * @version 2020-04-06
 */

public class Zeckendorf
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input;
        input = in.nextInt();
        while (input > 0)
        {
            int tempn = largestFib(input);
            System.out.println("The next number of tempn is : " + tempn);
            input = input - tempn;
        }
        in.close();
    }

    public static int largestFib(int n)
    {
        if (n == 0 || n == 1)
            return n;
        int a = 0;
        int b = 1;
        int c = 1;
        while (c <= n)
        {
            a = b;
            b = c;
            c = a + b;
        }
        return b;
    }
}