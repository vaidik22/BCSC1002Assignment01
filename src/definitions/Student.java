/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;
import java.util.Arrays;
import java.util.Scanner;
public class Student {
    private String studentFirstName;
    private String studentMiddleName;
    private String studentLastName;
    private long studentUniversityRollNumber;
    private int noOfBookIssued;
    private Book[] name;

    public Student() {
        Scanner s = new Scanner(System.in);
        String[] array = new String[20];

        System.out.println("Please enter books name");
        Scanner s1 = new Scanner(System.in);
        this.name = new Book[20];
        for (int i = 0; i < this.name.length; i++) {
            System.out.println("book name" + (i + 1));
            array[i] = s1.nextLine();
        }
    }

    public Student(Book[] name) {
        this.name = name;
    }

    public void setStudentFirstName(String studentFirstName) {

        this.studentFirstName = studentFirstName;
    }

    public void setStudentMiddleName(String studentMiddleName) {

        this.studentMiddleName = studentMiddleName;
    }

    public void setStudentLastName(String studentLastName) {

        this.studentLastName = studentLastName;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public void setNoOfBookIssued(int noOfBookIssued) {
        this.noOfBookIssued = noOfBookIssued;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentMiddleName() {
        return studentMiddleName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public int getNoOfBookIssued() {
        return noOfBookIssued;
    }
    @Override
    public String toString() {
        return "Student first name :" + getStudentFirstName() + ", " +
                "Student middle name :" + getStudentMiddleName() + ", " +
                "Student last name :" + getStudentLastName() +
                Arrays.toString(name);

    }

    public void listOfBooks(String newBookName) {
        for (Book Book : name) {
            System.out.println(Book);
        }
    }

    public Book[] getName(String newBookName)
    {
        return name.clone();
    }

    public void setName(Book[] name)
    {
        this.name = name;
    }

    public void setStudentFirstName() {
        getStudentFirstName();
    }

    public void setStudentMiddleName() {
        getStudentMiddleName();

    }

    public void setStudentLastName() {
        getStudentLastName();
    }

    public void setStudentUniversityRollNumber() {
        getStudentUniversityRollNumber();
    }
}