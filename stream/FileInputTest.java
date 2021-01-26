package stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest
{
    public static void main(String[] args)
    {
        FileInputStream in = null;
        // 文件输入流从文件系统中的某个文件获得输入字节
        try
        {
            in = new FileInputStream("test.bin");
            int avail = in.available();
            // available返回从InputStream读取的字节数
            byte[] data = new byte[avail];
            in.read(data);
            // 从此输入流中读取一个数据字节
            // 一次性读取所有数据
            in.close();

            for (byte b : data)
                System.out.println(b);
        }
        catch (IOException e )
        {
            System.out.println("File Open Error!!!");
        }
    }
}