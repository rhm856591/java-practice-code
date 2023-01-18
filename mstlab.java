// Write the program which detects the type of file.
// The program can detect that three types of files “pdf”, “jpg”, “png”
// When the user enters the file name like  file1.pdf the program shows it is a pdf file.
// The program must contain a while loop and keep asking for the file from the user. 
// Test case to be passed.
// File.jpg 
// Output: It is a jpg file 

// File.pdf.png  
// Output : It is a png file 
import java.util.*;
public class mstlab
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        
            
        while (true)
        {
            System.out.println("Enter the file name:");
            String input = sc.next();
            if (input.endsWith(".pdf"))
            {
                System.out.println("It is a pdf file");
            }
            else if (input.endsWith(".jpg"))
            {
                System.out.println("It is a jpg file");
            }
            else if (input.endsWith(".png"))
            {
                System.out.println("It is a png file");
            }
            else if(input.equals("exit"))
            {
                break;
            }
           
            else
            {
                System.out.println("It is an unknown file");
            }
            
        }
    }
}

