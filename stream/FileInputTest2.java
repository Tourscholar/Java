package stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2
{
    public static void main(String[] args)
    {
        FileInputStream in = null;
        try
        {
            in = new FileInputStream("test.bin");
            int data;
            for (; ;)
            {
                data = in.read();
                // 以此读取一个数据
                if (data == -1)
                    break;
                System.out.println(data);
            }
            in.close();
        }
        catch (IOException e )
        {
            System.out.println("File Open Error!!!");
        }
    }
}