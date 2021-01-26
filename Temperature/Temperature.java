package Temperature;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Temperature
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        // JFrame是一个顶层的框架类,好比一个窗户的框子,也是一个容器类,这个框子可以嵌入几个玻璃窗
        JPanel panel = new JPanel();
        // JPanel是一个容器类,相当于一面大玻璃窗
        f.add(panel);

        JLabel label1 = new JLabel("华氏温度");
        // JLabel等是一些基础组件,必须置于某个容器里,类似于窗花,剪纸,必须置于窗户的表面
        JLabel label2 = new JLabel("摄氏温度");
        JTextField field1 = new JTextField(15);
        // JTextField是一个轻量级组件,允许编辑单行文本
        JTextField field2 = new JTextField(15);
        JButton button = new JButton("转换");
        // JButton是一个按钮

        panel.add(label1);
        panel.add(field1);

        panel.add(label2);
        panel.add(field2);
        panel.add(button);

        f.setSize(250, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}