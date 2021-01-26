package week14_class_work;

public class StudentMain
{
    public static void main(String[] args) throws Exception
    {
        Student[] s = new Student[3];
        s[0] = new Student("Kim", "PROGRAM", 101, "010-1234-5678");
        s[1] = new Student("lee", "null", 102, "010-9876-7766");
        s[2] = new Student("jung", "ABCDEF", 103, "010-6767-3322");

        System.out.println("****************************************");
        for (Student t_s : s)
        {
            t_s.printData();
            System.out.println("****************************************");
        }

        System.out.println("총인원 수: " + Member.member_count);
        StudentFile sf = new StudentFile("test.txt", s);
    }
}