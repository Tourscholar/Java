package week3_class_work;

import java.util.*;
/**
 * @version 2020-04-03
 */
public class WordGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String [][] text = new String[][]
        {
            {"apple","苹果"},
            {"banana","香蕉"},
            {"watermelon","西瓜"},
            {"orange","橙子"},
            {"pencil","铅笔"},
            {"pen","钢笔"},
            {"eraser","橡皮"},
            {"office","办公室"},
            {"student","学生"},
            {"teatch","老师"},
        };
        int i = (int) (Math.random() * 10);
        String input;
        String str = null;
        do
        {
            System.out.println(text[i][1]);
            System.out.println("Please enter the corresponding English word: ");
            input = in.nextLine();
            for (; i < text.length; )
            {
                if (text[i][0].compareTo(input) == 0)
                /**
                 * 1.长度相同,从第一位开始比较,如果相同返回0,如果不同则返回这两个字符的ascii值的差值(大写英文字母比小写英文字母小)
                 * 2.长度不同,直接返回长度差值
                 * 对比数字时相同返回0, 不相同返回1
                */
                {
                    System.out.println("Success!");
                    System.out.println("Once again? (Yes/No): ");
                    i = (int) (Math.random() * 10);
                    str = in.nextLine();
                    break;
                }
                else 
                {
                    System.out.println("Fail!");
                    System.out.println("Once again? (Yes/No): ");
                    str = in.nextLine();
                    break;
                }
            }
        }
        while (str.equals("Yes"));
        in.close();
    }
}
    
    
