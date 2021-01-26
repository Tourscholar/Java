package stream;
import java.io.*;

public class textWrite
{
    public static void main(String[] args)
    {
        String str = "Java Stream inoutput";
        FileWriter out = null;
        // 字符输出流：每次读入或输出的是16位二进制,即两个字节
        try
        {
            out = new FileWriter("C:\\Users\\16081\\Desktop\\programming\\Java\\stream\\text.txt");
            out.write(str);
            out.close();
        }
        catch (IOException e )
        {
            System.out.println("File Open Error");
        }
    }
}