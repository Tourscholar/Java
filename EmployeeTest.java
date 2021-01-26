import java.time.*;
/**
 * This program tests Employee class.
 * @version 1.12 2020-01-11
 * @author Kang RongJie
 */

class Employee
{
    private final String name;
    private double salary;
    private LocalDate hireday;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireday = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireday;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = this.salary * byPercent / 100;
        this.salary = raise;
    }
}

public class EmployeeTest
{
    public static void main(String[] args)
    {
        // fill the staff with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Craker", 7500, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Test", 40000, 1990, 3, 15);

        // raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);
        // print out information about all Empoyee objects
        for (Employee e : staff)
            System.out.println("name = " + e.getName() + ",slalary = "
                        + e.getSalary() + ",hireDay = " + e.getHireDay());
    }
}