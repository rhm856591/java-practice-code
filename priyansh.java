// Write a program to take the password as input from the user. Match the password with the stored password.
// If the password match, then displays the message “Welcome to JAVA lab.”
// If the password does not match, the program continuously takes the password until the user types the right password. 
// The program must show the message if the user types the five times wrong passwords.

java.util.*;
public class mstlab
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String password = "java";
        int count = 0;
        while (true)
        {
            System.out.println("Enter the password:");
            String input = sc.next();
            if (input.equals(password))
            {
                System.out.println("Welcome to JAVA lab.");
                break;
            }
            else
            {
                count++;
                if (count == 5)
                {
                    System.out.println("You have entered the wrong password 5 times. Try again later.");
                    break;
                }
            }
        }
    }
}