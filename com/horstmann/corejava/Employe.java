package com.horstmann.corejava;

// the classes in this file are part of this package

import java.time.*;

// import statements come after the package statment

/**
 * @version 1.11 2020-01-19
 * @author Kang RongJie
 */

public class Employe
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employe(String name, double salary, int year, int month, int day)
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
}