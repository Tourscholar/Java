package DataStructure;
/**
 * 最大连续子序列和问题的三种算法
 * 给定N个整数的序列{A1,A2,...AN},求函数f(i,j)=max{0,Ai+A(i+1)+...Ak}的最大值
 */
public class MaxSubseqSum
{   
    /* 时间复杂度 T(N) = O(N^3) */
    public static int MaxSubseqSum1 (int A[], int N)
    {
        int ThisSum, MaxSum = 0;
        int i, j, k;
        for (i = 0; i < N; i++) /* i是子列左端位置 */
        {
            for (j = i; j < N; j++) /* j是子列右端位置 */
            {
                ThisSum = 0;    /* ThisSum是从A[i]到A[j]的子列和 */
                for (k = i; k <= j; k++)
                    ThisSum += A[k];
                if (ThisSum > MaxSum)   /* 如果刚得到的这个子列和更大 */
                    MaxSum = ThisSum;   /* 则更新结果 */
            }   /* j循环结束 */
        }   /* i循环结束 */
        return MaxSum;
    }

    /* 时间复杂度 T(N) = O(N^2) */
    public static int MaxSubseqSum2 (int A[], int N)
    {
        int ThisSum, MaxSum = 0;
        int i, j;
        for (i = 0; i < N; i++) /* i是子列左端位置 */
        {
            ThisSum = 0;    /* ThisSum是从A[i]到A[j]的子列和 */
            for (j = i; j < N; j++)     /* j是子列右端位置 */
            {
                ThisSum += A[j];    /* 对于相同的i, 不同的j, 只要j-1此循环的基础上累加1项即可 */
                if (ThisSum > MaxSum)   /* 如果刚得到的这个子列和更大 */
                    MaxSum = ThisSum;   /* 则更新结果 */
            }   /* j循环结束 */
        }   /* i循环结束 */
        return MaxSum;
    }

    /* 时间复杂度 T(N) = O(NlogN) */
    public static int DivideAndConquer (int List[], int left, int right)
    {
        int MaxLeftSum, MaxRightSum;    /* 存放左右子问题的解 */
        int MaxLeftBorderSum = 0,  MaxRightBorderSum = 0;    /* 存放跨分界线的结果 */

        int LeftBorderSum = 0, RightBorderSum = 0;
        int center, i;

        if (left == right)
        {
            /* 递归的终止条件, 子列只有1个数字 */
            if (List[left] > 0)
                return List[left];
            else
                return 0;
        }
        /* 下面是"分"过程 */
        center = (left + right) / 2;    /* 找到中分点 */
        /* 递归求得两边子列的最大和 */
        MaxLeftSum = DivideAndConquer(List, left, right);
        MaxRightSum = DivideAndConquer(List, center+1, right);

        /* 下面求跨分界线的最大子列和 */
        MaxLeftBorderSum = 0;
        LeftBorderSum = 0;
        for (i = center; i >= left; i--)
        {
            LeftBorderSum += List[i];
            if (LeftBorderSum > MaxLeftBorderSum)
                MaxRightBorderSum = RightBorderSum;
        }   /* 右边扫描结束 */

        /* 下面返回"治"的结果 */
        return Max3 (MaxLeftSum, MaxRightSum, MaxLeftBorderSum + MaxRightBorderSum);
    }

    public static int MaxSubseqSum3(int A[], int N)
    {
        return DivideAndConquer(A, 0, N-1);
    }

    /* 时间复杂度 T(N) = O(N) */
    public static int MaxSubseqSum4 (int A[], int N)
    {
        int ThisSum, MaxSum;
        int i;
        ThisSum = MaxSum = 0;
        for (i = 0; i < N; i++)
        {
            ThisSum += A[i];    /* 向右累加 */
            if (ThisSum > MaxSum)
                MaxSum = ThisSum;   /* 发现更大和则更新当前结果 */
            else if (ThisSum < 0)   /* 如果当前子列和为负 */
                ThisSum = 0;    /* 则不可能使后面的部分和增大, 抛弃之 */
        }
        return MaxSum;
    }

    public static int Max3(int A, int B, int C)
    {
        /* 返回3个整数中的最大值 */
        return A > B ? A > C ? A : C : B > C ? B : C;
    }

}