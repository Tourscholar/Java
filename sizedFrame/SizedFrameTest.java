package sizedFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @version 2020-06-12
 */

public class SizedFrameTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(()->
            {
                JFrame frame = new SizedFrame();
                frame.setTitle("SidedFrame");
                /**
                 * frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                 * 将主框架尺寸设置为最大
                 */
                // 用于改变标题栏的文字
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // 用户关闭这个框架时的响应动作
                frame.setVisible(true);
                // 显示框架
            });
    }
}

class SizedFrame extends JFrame
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public SizedFrame()
    {
        // get screen dimensions

        Toolkit kit = Toolkit.getDefaultToolkit();
        // 调用Toolkit类的静态方法getDefaultToolkit得到一个Toolkit对象
        Dimension screenSize = kit.getScreenSize();
        // 调用getScreenSize方法以Dimensiond对象的形式返回屏幕的大小
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        // set frame width, height and let platform pick screen location

        setSize(screenWidth / 2, screenHeight / 2 );
        setLocationByPlatform(true);
        // 窗口系统会选用窗口的位置(而不是大小),通常是距最后一个显示窗口很少偏移量的位置

        Image img = new ImageIcon("icon.gif").getImage();
        setIconImage(img);
        // setIconImage用于告诉窗口系统在标题栏,任务栏切换窗口等位置显示哪个图标
    }
}