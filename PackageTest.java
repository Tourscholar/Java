import com.horstmann.corejava.*;
// the Employee class is defined in that package

import static java.lang.System.*;

/**
 * This program demonstrates the use of package.
 * @version 1.11 2020-01-19
 * @author Kang RongJie
 */

public class PackageTest
{
    public static void main(String[] args)
    {
        // beacuse of the import statement, we don't have to use
        // com.horstmann.corejava.Employee here
        Employe harry = new Employe("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        out.println("name = " + harry.getName() + ", salary = "
                    + harry.getSalary());
    }
}