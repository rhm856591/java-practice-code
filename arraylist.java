// Write a Program to perform the basic operations like insert, delete, display and search in list. List contains String object items where these operations are to be performed.
// Sample Input and Output :
// 1
// Enter the item to be inserted:
// Bottle
// 1
// Enter the item to be inserted:
// Water
// 1
// Enter the item to be inserted:
// Cap
// 1
// 2
//  1. Insert
//  2. Search
//  3. Delete
//  4. Display
//  5. Exit
//  Enter your choice :
//  Inserted successfully
//  1. Insert
//  2. Search
//  3. Delete
//  4. Display
//  5. Exit
//  Enter your choice :
//  Inserted successfully
//  1. Insert
//   3. Delete
//  4. Display
//  5. Exit
//  Enter your choice :
//  Inserted successfully
//  1. Insert
//  2. Search
//  3. Delete
//  4. Display
//  5. Exit
//  Enter your choice :
//  Enter the item to be inserted:
//  Monitor
//  Inserted successfully
//  1. Insert
//  2. Search
//  3. Delete
//  4. Display
//  5. Exit
//  Enter your choice :
//     Enter the item to search :
//  Mouse
//  Item not found in the list.
//  1. Insert
//  2. Search
//  3. Delete
//  4. Display
//  5. Exit
//  Enter your choice :
// 2
// 3
// 4
// The Items in the list are :
// Bottle Water Cap
// 3
// Enter the item to delete :
// Cap
//  Enter the item to search :
//  Monitor
//  Item found in the list.
//  1. Insert
//  2. Search
//  3. Delete
//  4. Display
//  5. Exit
//  Enter your choice :
//  Enter the item to delete :
//  Mouse
//  Item does not exist.
//  1. Insert
//  2. Search
//  3. Delete
//  4. Display
//  5. Exit
//  Enter your choice :
//   Monitor
//  1. Insert
//  2. Search
//  3. Delete
//  4. Display
//  5. Exit
//  Enter your choice :
//   Deleted successfully
//  1. Insert
//  2. Search
//  3. Delete
//  4. Display
//  5. Exit
//  Enter your choice :
// 4
 
// The Items in the list are :
// Bottle Water
// 5
//  Monitor
//  1. Insert
//  2. Search
//  3. Delete
//  4. Display
//  5. Exit


import java.util.*;
class arraylist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<String>();
        int ch;
        do
        {
            System.out.println("1. Insert ");
            System.out.println("2. Search ");
            System.out.println("3. Delete ");
            System.out.println("4. Display ");
            System.out.println("5. Exit ");
            System.out.println("Enter your choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the item to be inserted: ");
                String item=sc.next();
                al.add(item);
                System.out.println("Inserted successfully " + item);
                break;
                case 2:
                System.out.println("Enter the item to search : ");
                String item1=sc.next();
                if(al.contains(item1))
                {
                    System.out.println("Item found in the list. "+ item1);
                }
                else
                {
                    System.out.println("Item not found in the list. " + item1);
                }
                break;
                case 3:
                System.out.println("Enter the item to delete : ");
                String item2=sc.next();
                if(al.contains(item2))
                {
                    al.remove(item2);
                    System.out.println("Deleted successfully");
                }
                else
                {
                    System.out.println("Item does not exist.");
                }
                break;
                case 4:
                System.out.println("The Items in the list are : ");
                for(String i:al)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
                break;
                case 5:
                System.out.println("You have exited the program.");
                break;
                default:
                System.out.println("Invalid choice");
            }
        }while(ch!=5);
    }
}

