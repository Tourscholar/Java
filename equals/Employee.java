package equals;

import java.time.*;
import java.util.Objects;

public class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
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
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public boolean equals(Object otherObject)
    {
        // a quick test to see if the objects are identical
        if (this == otherObject)
            return true;
        
        // must return false if the explicit parameter is null
        if (otherObject == null)
            return false;
        
        // if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass())
        // getClass()返回一个对象所属的类
            return false;
        
        // now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;

        // test whether the fields have identical values
        return Objects.equals(name, other.name) 
            && salary == other.salary
            && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode()
    // hashCode()没有参数则返回对象的的散列码
    {
        return Objects.hash(name, salary, hireDay);
        // 返回一个散列码, 由提供的所有对象的散列码组合而得到
    }

    public String toString()
    // toString()方法返回表示对象值的字符串
    {
        return getClass().getName() + "[name = " + name + ", salary = "
            + salary + ", hireDay = " + hireDay + "]";
    }
}
