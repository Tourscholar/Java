import java.util.*;

/**
 * This program demonstrates console input,
 * @version 1.10 2020-01-04
 * @author Kang RongJie
 */
public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //get ftrst input
        System.out.print("What is your name? ");
        String name = in.nextLine();
        // nextLine方法输入一行

        // get second input
        System.out.print("How old are you? ");
        int age = in.nextInt();

        //dispalay output on console
        System.out.println("Hello, " + name + ". Next year, you'll be "
            + (age + 1));
        in.close();
    }
}