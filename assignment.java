// Create an ArrayList of Employee( id,name,address,sal) objects and search for particular
// Employee object based on id number.
// Create an ArrayList of Employee( id,name,address,sal) objects and search for particular Employee object based on id number. 
import java.util.*;
public class assignment
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<Employee>();
        while (true)
        {
            System.out.println("1. Add an Employee");
            System.out.println("2. Search an Employee");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the employee name:");
                    String name = sc.next();
                    System.out.println("Enter the employee id:");
                    int id = sc.nextInt();
                    System.out.println("Enter the employee address:");
                    String address = sc.next();
                    System.out.println("Enter the employee salary:");
                    int salary = sc.nextInt();
                    list.add(new Employee(id, name, address, salary));
                    break;
                case 2:
                    System.out.println("Enter the employee id:");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Employee e : list)
                    {
                        if (e.id == searchId)
                        {
                            System.out.println("Employee found");
                            System.out.println("Name: " + e.name);
                            System.out.println("Address: " + e.address);
                            System.out.println("Salary: " + e.salary);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                    {
                        System.out.println("Employee not found");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
class Employee
{
    int id;
    String name;
    String address;
    int salary;
    public Employee(int id, String name, String address, int salary)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}



