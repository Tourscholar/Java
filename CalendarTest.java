import java.time.*;

/**
 *@version 1.5 2020-01-11
 *@author Kang RongJie
 */

public class CalendarTest
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // set to start of month
        // 调到当前月的月初,即当前日期减today
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday,... 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 0; i <= value; i++)
            System.out.print("  ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
                // 如果是当前日期加上一个星号
            else 
                System.out.print(" ");
                // 如果不是当前日期加上一个空格
            date = date.plusDays(1);
            // 当前日期加一天
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
                // 如果是星期一则调到另一行的行首
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}