package week2_class_work;
import javax.swing.*;
/**
 * The Dice game of enter 1~6 with computer.
 * @version 2020-03-27
 */

public class DiceGame
{
    public static void main(String[] args)
    {
        String str = null;
        do
        {
            String numberstr = JOptionPane.showInputDialog("Please enter a number of 1~6: ");
            int number = Integer.parseInt(numberstr);
            if (number < 1 || number > 6)
            {
                System.out.println("Input error! Please enter again!");
                continue;
            }
            int random_num_int = (int) (Math.random() * 6 + 1);
             // Math.random()返回0~1之间(大于等于0 小于1)的随机浮点数
            if (number > random_num_int)
                System.out.println("You win!");
            if (number == random_num_int)
                System.out.println("Play even!");
            if (number < random_num_int)
                System.out.println("You lose!");
            str = JOptionPane.showInputDialog("Once again? (Yes/No): ");
        }
        while (str.equals("Yes"));
    }
}