/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;
import definitions.Student;
import definitions.Library;
import definitions.Book;
import java.util.Scanner;
public class FrontDesk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        Student studentDetail = new Student();
        Library libraryDetail = new Library();
        Book bookDetails = new Book();
        menu:
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("please enter your first name : ");
                    scanner.nextLine();
                    studentDetail.setStudentLastName();
                    System.out.println("please enter your middle name : ");
                    scanner.nextLine();
                    studentDetail.setStudentMiddleName();
                    System.out.println("please enter your last name : ");
                    scanner.nextLine();
                    studentDetail.setStudentLastName();
                    System.out.println("please enter your university roll number : ");
                    scanner.nextLine();
                    studentDetail.setStudentUniversityRollNumber();
                    System.out.println("Please enter the name of the book : ");
                    scanner.nextLine();
                    String newBookName = scanner.nextLine();
                    studentDetail.listOfBooks(newBookName);

                    break;
                case 2:
                    System.out.println("Please enter the name of the book:");
                    scanner.nextLine();
                    newBookName = scanner.nextLine();
                    studentDetail.getName(newBookName);
                    System.out.println("Please enter the name of the author");
                    scanner.nextLine();
                    bookDetails.setBookAuthor();
                    break;
                case 3:
                    System.out.println("Name of the books are");
                    libraryDetail.available();
                    break;
                case 4:
                    System.out.println("Exit");
                    break menu;
                default:
                    System.out.println("Wrong Choice!");
            }
        } while (userInput != 4);
        scanner.close();
    }
}