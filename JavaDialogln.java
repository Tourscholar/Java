import javax.swing.*;

/**
 * @author Kang RongJie
 * @version 2020-03-20
 */

class JavaDialogln
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        System.out.println("Hello " + name + " !");

        String agestr = JOptionPane.showInputDialog("Please enter your age: ");
        int age = Integer.parseInt(agestr);
        /**
         * parseInt()方法用于将字符串参数作为有符号的十进制整数进行解析
         * 如果方法有两个参数,使用第二个参数指定的基数,将字符串参数解析为有符号的整数
         */
        System.out.println("Your age are " + age + "!");
    }
}
