package DataStructure;
/**
 * 两种算法求解给定多项式在给定定点x处的值
 */
public class polynomial
{
    public static void main(String[] args)
    {
        final int MAXN = 10;    /* 多项式项数 */
        final int MAXK = (int) 1e7; /* 被测函数最大重复调用次数 */
        double [] a = new double[MAXN];
        int i;
        for (i = 0; i < MAXN; i++)
        {
            a[i] = (double)i;
        }
        /* 以毫秒为单位计算运行时间 */
        long startTimeOne = System.currentTimeMillis();
        for (i = 0; i < MAXK; i++) /* 重复调用函数以获得充分多的运行时间 */
        {
            functionOne(MAXN-1, a, 1.1);
        }
        long endTimeOne = System.currentTimeMillis();
        System.out.println((endTimeOne - startTimeOne) + "ms");
        long startTimeTwo = System.currentTimeMillis();
        for (i = 0; i < MAXK; i++)
        {
            functionTwo(MAXN-1, a, 1.1);
        }
        long endTimeTwo = System.currentTimeMillis();
        System.out.println((endTimeTwo - startTimeTwo) + "ms");

    }
    /* f(x) = a0 +a1*x+...+an-1*x^(n-1)+an*x^n*/
    public static double functionOne(int n, double a[], double x)
    {
        int i;
        double p = a[0];
        for (i = 1; i <= n; i++)
        {
            p += (a[i] * Math.pow(x, i));
        }
        return p;
    }
    /* f(x) = a0 + x*(a1+x*(...(an-1+x*(an))...)) */
    public static double functionTwo(int n, double a[], double x)
    {
        int i;
        double p = a[n];
        for (i = n; i > 0; i--)
        {
            p = a[i - 1] + x * p;
        }
        return p;
    }
}