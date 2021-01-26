package week14_class_work;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.io.*;

public class Student extends Member implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String tel;
    private int num;

    public Student(String id, String pwd, int num, String tel)
    {
        super(id);
        this.pwd = pwd;
        this.num = num;
        this.tel = tel;
    }

    public void printData()
    {
        if (is_ok_pwd(pwd) == false)
        {
            pwd = gen_pwd();
        }
        String date;
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("2020년 6월 18일 ahh:mm:ss");
        date = sdf.format(today.getTime());
        System.out.println(id + " " + pwd + " " + num + " " + tel + " " + date);
    }
}