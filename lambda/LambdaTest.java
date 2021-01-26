package lambda;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demostrates the use of lambda expressions
 * @version 2020-05-20
 */

public class LambdaTest
{
    public static void main(String[] args)
    {
        String [] planets = new String [] 
        {
            "Mercury", "Venus", "Earth", "Mars", "Jupiter", 
            "staurn", "Uranus", "Neptune" 
        };
        System.out.println(Arrays.toString(planets));
        // Arrays.toString()方法打印数组的字符串形式
        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length: ");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(2000, event -> System.out.println("The time is " + new Date()));
        // 如果方法只有一个参数并且参数的类型可以推导出,则可以省略小括号
        t.start();

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}