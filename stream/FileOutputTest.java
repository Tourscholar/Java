package stream;

import java.io.*;

public class FileOutputTest
{
    public static void main(String[] args)
    {
        byte[] data = {8, 9, 0, 6, 2, 9 ,9};
        FileOutputStream out = null;
        // 文件输出流是用于将数据写入到文件中
        try
        {
            out = new FileOutputStream("test.bin");
            out.write(data);
            // 向文件中写入一个字节大小的数据
            System.out.println("Write Success");
        }
        catch (IOException e )
        {
            System.out.println("File output error");
        }
        finally
        {
            try
            {
                out.close();
            }
            catch (Exception e)
            {
                ;
            }
        }
    }
}