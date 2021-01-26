package week5_class_work;

import java.util.*;
/**
 * @version 2020-04-17
 */

public class Calender
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of year: ");
        int year = in.nextInt();
        System.out.print("Please enter the number of month: ");
        int month = in.nextInt();
        System.out.println("******** " + year + "년 " + month + "월 " + "********");
        printCalender(year, month);
        in.close();
    }
    public static int getDay(int year, int month)
    {
        int [] arDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        for (int i = 1900; i <= year; i++)
        {
        	if (year > i)
            {
                if (isLeapYear(i) == true)
                {
                	days = days + 366;
                }
                else
                {
                    days = days + 365;
                }
            }
            else
            {
                if (isLeapYear(i) == true)
                {
                	arDays[2] = 29;
                    for (int j = 0; j < month; j++)
                    {
                        days = days + arDays[j];
                    }
                }
                else
                {
                    for (int j = 0; j < month; j++)
                    {
                        days = days + arDays[j];
                    }
                }
            }
        }
        return days;
    }

    public static boolean isLeapYear(int year)
    // 计算闰年还是平年
    {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        else
            return false;
    }

    public static void printCalender(int year, int month)
    {

        System.out.printf("%4s%4s%4s%4s%4s%4s%4s", "Sun", "Mon", "Tue", "Wed",
                                                    "Thu", "Fri", "Sat");
        System.out.println();
        int total = getDay(year, month);
        final int START_DAY_19000101 = 1;
        // 1900年1月1日是星期1
        int startDay = (total + START_DAY_19000101) % 7;
        // 计算该月第一天是星期几
        int dayOfMonth;
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12)
        {
            dayOfMonth = 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            dayOfMonth = 30;
        }
        else 
        {
            dayOfMonth = isLeapYear(year) ? 29 : 28;
        }
        for (int i =  0; i < startDay; i++)
        {
            System.out.printf("    ");
        }
        for (int i = 1; i <= dayOfMonth; i++)
        {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0)
            {
                System.out.println();
            }
        }
        System.out.println();
    }
}