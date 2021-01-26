package notHelloWorld;

import javax.swing.*;
import java.awt.*;

/**
 * @version 2020-06-12
 */

public class NotHelloWorld
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(()->
            {
                JFrame frame = new NotHelloWorldFrame();
                frame.setTitle("NotHelloWorld");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            });
    }
}

/**
 * A frame that contains a message panel
 */

class NotHelloWorldFrame extends JFrame
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public NotHelloWorldFrame()
    {
        add(new NotHelloWorldComponent());
        pack();
    }
}

/**
 * A component that displays a message
 */

class NotHelloWorldComponent extends JComponent
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
    
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    
    public void paintComponent(Graphics g)
    {
        g.drawString("Not a Hello, world program", MESSAGE_X, MESSAGE_Y);
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

}