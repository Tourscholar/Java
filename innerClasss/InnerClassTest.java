package innerClasss;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates the use of inner classes.
 * @version 2020-05-22
 */

class TalkingClock
{
    private int interval;
    private boolean beep;

    /**
     * Construs a talking clock
     * @param interval the interval between messages (in millseconds)
     * // param s 表示对参数s的解释
     * @param beep true if the clock should beep
     */

    public TalkingClock(int interval, boolean beep)
    {
        this.interval = interval;
        this.beep = beep;
    }
    /**
     * Starts the clock.
     */
    public void start()
    {
        ActionListener listener = this.new TimePrinter();
        // 当在start方法中创建了TimePrinter对象后,编译器就会将this引用自动传递给当前的语音时钟的构造器
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener
    {
        // 因为TimerPrinter类没有定义构造器,所以编译器为这个类生成了一个默认的构造器
        /**
         * public Timerprinter(TalkingClock clock)
         * {
         *      outer = clock;
         * }
        */
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("At the tone, the time is " + new Date());
            if (TalkingClock.this.beep) 
            // 在外围类的作用域之外,可以用 OuterClass.InnerClass来引用内部类
            // beep引用了创建TimerPrinter的TalkingClock对象的域
            // 内部类既可以访问自身的数据域,也可以访问创建它的外围类对象的数据域
                Toolkit.getDefaultToolkit().beep();
        }
    }
}

public class InnerClassTest
{
    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock(1000, true);
        // 内部类的对象有一个隐式引用,可以引用实例化该内部对象的外围类对象
        clock.start();

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}