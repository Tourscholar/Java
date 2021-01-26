package week14_class_work;
import java.util.*;

public class Member
{
    public static int member_count = 0;
    protected String id;
    protected String pwd;

    Member(String id)
    {
        this.id = id;
        this.pwd = "";
        member_count++;
    }

    boolean is_ok_pwd(String pwd)
    {
        if (pwd.length() < 4 || pwd.length() > 10)
        {
            return false;
        }
        for (int i = 0; i < pwd.length(); i++)
        {
            int tmp = pwd.charAt(i);
            if (tmp < 65 || tmp > 91)
            {
                return false;
            }
        }
        return true;
    }

    String gen_pwd()
    {
        int temp;
        String t_pwd = "";
        int pwd_len = (int)((Math.random() * 10) % 7 + 4);

        for (int i = 0; i < pwd_len; i++)
        {
            temp = (int)((Math.random() * 10) % 65 + 65);
            t_pwd = t_pwd + Character.toString((char)temp);
        }
        return t_pwd;
    }

    boolean set_pwd(String pwd)
    {
        Scanner in = new Scanner(System.in);

        if (is_ok_pwd(pwd))
        {
            this.pwd = pwd;
        }
        else 
        {
            System.out.println("추천 패스워드: " + gen_pwd());

            for (int i = 1; i < 3; i++)
            {
                while (pwd ==null || pwd.length() < 4 || pwd.length() > 10)
                {
                    System.out.print("패스워드 입력: ");
                    pwd = in.next();
                }
                if (is_ok_pwd(pwd))
                {
                    this.pwd = pwd;
                    break;
                }
                else 
                {
                    System.out.println("적절하기 않습니다! 다시 입력하세요: ");
                    this.pwd = pwd = null;
                }
            }
        }
        in.close();
        if (pwd != null)
        {
            return true;
        }
        else 
        {
            System.out.println("패스워드 입력 실패!!!");
            return false;
        }
    }

    void printIDPWD()
    {
        System.out.print("아이디: " + id + "\n");
        System.out.println("패스워드: " + pwd);
    }
}