package week13_class_work;

class HW3 
{
    private int[] score;
    private String name;

    HW3(int[] score, String name) throws Exception 
    {
        this.score = new int[score.length];
        for (int i = 0; i < score.length; i++) 
        {
            this.score[i] = score[i];
        }
        this.name = name;
    }

    public void printScore() 
    {
        System.out.print(name + "의 성적: ");
        for (int s : score) 
        {
            System.out.println(s + " ");
        }
    }

    public int[] getScore() 
    {
        int[] copy = new int[this.score.length];
        System.arraycopy(this.score, 0, copy, 0, copy.length);
        return copy;
    }
}

public class HW3Test 
{
    public static void main(String[] args) 
    {
        int[] jumsu = { 56, 90, 40 };
        String name = "채치수";

        HW3 student;
        try 
        {
            student = new HW3(jumsu, name);
            student.printScore();
            int[] t_score = null;
            t_score = student.getScore();

            t_score[0] = t_score[1] = t_score[2] = 100;
            student.printScore();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}