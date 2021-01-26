package Counter;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Counter extends JFrame
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JButton button;
    private JLabel label;
    int counter = 0;

    class MyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            counter++;
            label.setText("현재 카운터 값: " + counter);
        }
    }

    public Counter()
    {
        setSize(400, 150);
        setTitle("Event Sample");
        setLayout(new FlowLayout());

        button = new JButton("증가");
        label = new JLabel("현재 카운터 값 " + counter);

        add(label);
        add(button);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        Counter t = new Counter();
    }
}