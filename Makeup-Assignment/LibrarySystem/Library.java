/* 
    Aaron Johnson
    11/25/2024
    This assignment will replace M3 ZyBooks Branches

    This program is a simple text-based library management system, allowing 
    users to add, view, search or borrow books from a library.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Library 
{
    public static void main(String[] args) 
    {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<Book>();
        int actChoice = 0;
            
        while (actChoice != 5) 
        {
        System.out.println("Select an action:");
        System.out.println("1. View all available books");
        System.out.println("2. Add a new book");
        System.out.println("3. Search for a book");
        System.out.println("4. Borrow a book");
        System.out.println("5. Exit the system\n");

        actChoice = scnr.nextInt();
        scnr.nextLine();
        System.out.println();

            // view all books
            if (actChoice == 1) 
            {
                System.out.println("Books Available: ");
                for (int i = 0; i < bookList.size(); i++ ) 
                {
                    bookList.get(i).displayInfo();
                    System.out.println();
                }
                System.out.println();
            }
            //add book to library
            else if (actChoice == 2) 
            {
                System.out.println("Enter Title of Book: ");
                String tempTitle = scnr.nextLine();
                System.out.println("Enter Name of Author: ");
                String tempAuthor = scnr.nextLine();
                System.out.println("Enter Year Published: ");
                int tempYear = scnr.nextInt();
                scnr.nextLine();
                System.out.println();

                bookList.add(new Book(tempTitle, tempAuthor, tempYear));
            }   
            else if (actChoice == 3) 
            {
                System.out.println("Enter the book you would like to search for: ");
                String tempSearch = scnr.nextLine();
                for (int i = 0; i < bookList.size(); i++) 
                {
                    //FIXME Figure out how to search by title of book
                }
            }
            else if (actChoice == 4)
            {
                System.out.println("Enter the book you would like to borrow: ");
                //FIXME I probably need to finish the search function first.
            }
        }
    }
}
