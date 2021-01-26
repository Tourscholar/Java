package week1_class_work;
import javax.swing.*;   /* Java图形化界面 */

/**
 * Enter the length and width to find the area of the rectangle.
 * @version 2020-03-20
 */

public class RectangleArea
{
    public static void main(String[] args)
    {
        String lengthstr = JOptionPane.showInputDialog("Please enter the length of the rectangle: ");
        int length = Integer.parseInt(lengthstr);
        /* parsenInt()方法用于将字符串参数作为有符号的十进制整数进行解析
           如果方法有两个参数,使用第二个参数指定的基数,将字符串参数解析为有符号的整数
        */

        String widthstr = JOptionPane.showInputDialog("Please enter the width of the rectangle: ");
        int width = Integer.parseInt(widthstr);
        
        int area = length * width;
        System.out.println("The area of the rectangle are " + area + ".");
    }
}