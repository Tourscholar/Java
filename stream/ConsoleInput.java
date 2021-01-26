package stream;

import java.io.*;

public class ConsoleInput
{
    public static void main(String[] args)
    {
        int name;
        System.out.println("Please click Ctrl+Z when you enter end ");
        InputStreamReader r = new InputStreamReader(System.in);
        // 是字节流与字符流之间的桥梁,能将字节流输出为字符流,并且能为字节流指定字符集
        // 可输出一个个的字符
        for (; ;)
        {
            try
            {
                name = r.read();
                if (name == -1)
                    break;
                System.out.print((char) name);
                // 使用强制转换将read到的int字节转化为char型
            }
            catch (IOException e )
            {
                System.out.println("Input Error");
            }
        }
        System.out.println("The end of enter");
    }
}