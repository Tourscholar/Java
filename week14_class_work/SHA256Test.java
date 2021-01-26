package week14_class_work;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Test
{
    public static void main(String[] args) throws Exception
    {
        String msg = "I am s student.I am a student";
        byte[] sha256_result = sha256(msg);
        System.out.println(bytesToHex1(sha256_result));
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