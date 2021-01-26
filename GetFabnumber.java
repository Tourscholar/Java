import java.util.*;

public class GetFabnumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: " );
        int input = in.nextInt();
        System.out.println("The sum of chicken are: " + FindFbi(input));
        in.close();
    }
    // 齐肯多夫定理求斐波那契数列
    public static int FindFbi(int n)
    {
        int Finallnumber = 0;
        do 
        {
            int a = 0;
            int b = 1;
            int c = 1;
            int number = 0;
            while (c <= n)
            {
                a = b;
                b = c;
                c = a + b;
                number = number + 1;
            }
            Finallnumber = GetFab(number) + Finallnumber;
            n = n - b;
        }
        while (n > 0);
        return Finallnumber;
    }
    // 求斐波那契的第N项
    public static int GetFab(int position)
    {
        if (position == 0 || position == 1)
        {
            return position;
        }
        int x = 0;
        int y = 1;
        int sum = 0;
        for (int i = 2; i <= position; i++)
        {
            sum = x + y;
            x = y;
            y = sum;
        }
        return sum;
    }
}