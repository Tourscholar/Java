package week9_class_work;

import java.util.Scanner;

class Member
{
    static int member_count = 0;
    String id;
    private String pwd;

    public Member(String s)
    {
        this.id = s;
        this.pwd = null;
        member_count = member_count + 1;
    }

    public boolean is_ok_pwd(String ispwd)
    {
        boolean pwd = false;
        if (ispwd.length() >= 4 && ispwd.length() <= 10)
        {
            for (int i = 0; i < ispwd.length(); i++)
            {
                char ch = ispwd.charAt(i);
                if (ch >= 'A' && ch <= 'Z')
                {
                    pwd = true;
                }
            }
        }
        return pwd;
    }

    public String gen_pwd()
    {
        int random_num_int = (int) (Math.random() * 7 + 4);
        String str = "";
        for (int i = 0; i < random_num_int; i++)
        {
            str = str + (char)(Math.random() * 26 + 'A');
        }
        return str;
    }

    public boolean set_pwd(String setpwd)
    {

        System.out.println("Suggested password:" + gen_pwd());
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Please enter you password: ");
            String strpwd = in.next();
            if (is_ok_pwd(strpwd) == false)
            {
                continue;
            }
            else
            {
                this.pwd = strpwd;
                return true;
            }
        }
        in.close();
        this.pwd = null;
        return false;
    }
    public void test_pwd()
    {
        System.out.println(pwd);
    }

    public String getPwd()
    {
        return pwd;
    }
}

public class MemberTest
{
    public static void main(String[] args)
    {
        Member Kim = new Member("kim");
        Member lee = new Member("lee");
        Member jung = new Member("jung");
        System.out.println("id: " + Kim.id);
        if (Kim.set_pwd("ABC"))
        {
            System.out.println("pwd: " + Kim.getPwd());
        }
        System.out.println("id: " + lee.id);
        if (lee.set_pwd("ASDFG"))
        {
        	System.out.println("pwd : " + lee.getPwd());
        }
        System.out.println("id: " + jung.id);
        if (jung.set_pwd("POIUY"))
        {
        	System.out.println("pwd : " + jung.getPwd());
        }
        System.out.println("The sum of member numbers: " + Member.member_count);
    }
}