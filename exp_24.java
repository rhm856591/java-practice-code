import java.util.*;
import java.io.*;
public class exp_24
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
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
                    System.out.println("Enter the employee designation:");
                    String designation = sc.next();
                    System.out.println("Enter the employee salary:");
                    int salary = sc.nextInt();
                    FileWriter fw = new FileWriter("employee.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    pw.println(name + " " + id + " " + designation + " " + salary);
                    pw.close();
                    break;
                case 2:
                    FileReader fr = new FileReader("employee.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String line = br.readLine();
                    while (line != null)
                    {
                        System.out.println(line);
                        line = br.readLine();
                    }
                    br.close();
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