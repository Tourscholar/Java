package week14_class_work;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class  StudentFile
{
    private static Student[] student;
    private static String str;

    public StudentFile(String str, Student[] students) 
    {
        StudentFile.student = students;
        StudentFile.str = str;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchAlgorithmException 
    {
        Student[] s = new Student[3];
        for (int i = 0; i < 3; i++)
        {
            s[i] = student[i];
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(str), true));
            oos.writeObject(s[i]);
            oos.close();
        }
        for (int i = 0; i < 3; i++)
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(str)));
            Student [] person = (Student[]) ois.readObject();
            String msg = person[i].pwd.toString();
            byte[] sha256_result = sha256(msg);
            person[i].pwd = bytesToHex1(sha256_result);
        }
    }

    public static byte[] sha256(String msg) throws NoSuchAlgorithmException
    {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(msg.getBytes());
        return md.digest();
    }

    public static String bytesToHex1(byte[] bytes)
    {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes)
        {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }
    
}