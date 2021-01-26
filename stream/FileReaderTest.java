package stream;

import java.io.*;

public class FileReaderTest
{
    public static void main(String[] args)
    {
        FileReader in = null;
        try
        {
            in = new FileReader("C:\\Users\\16081\\Desktop\\programming\\Java\\stream\\text.txt");
            char[] text = new char[20];
            in.read(text);
            System.out.println(text);
            in.close();
        }
        catch (IOException e)
        {
            System.out.println("File Open Error");
        }

    }
}