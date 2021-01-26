package simpleFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @version 2020-06-12
 */

public class SimpleFrameTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(()->
            {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // 用户关闭这个框架时的响应动作
                frame.setVisible(true);
                // 显示框架
            });
    }
}

class SimpleFrame extends JFrame
{
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
