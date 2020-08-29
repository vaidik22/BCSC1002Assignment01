/*  Created by IntelliJ IDEA.
 *  User: vaidik nigam (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookISBN;

    public Book(String bookName, String bookAuthor, String bookISBN) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
    }

    public Book() {
        this.getBookName();
        this.getbookISBN();
        this.getbookAuthor();
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private String getbookISBN() {
        return bookISBN;
    }


    private String getbookAuthor() {
        return bookAuthor;
    }


    private String getBookName() {
        return bookName;
    }
    // The toString() method
    // used to convert the object's attributes to a String.
    public String toString() {
        return "Book Name: " + getBookName() + ", " +
                "Book Author Name :" + getbookAuthor() + ", " +
                "Book ISBN : " + getbookISBN() + ".";

    }
    // The equals() method and the hashCode() method.
    // equals : compares two objects of the same class and tell whether they are equal

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return getbookISBN() == book.getbookISBN() &&
                getbookAuthor() == book.getbookAuthor() &&
                Objects.equals(getBookName(), book.getBookName());
    }
    // It creates the hashcode of an object for us.
    @Override
    public int hashCode() {
        return Objects.hash(getbookAuthor(),getbookISBN(),getBookName());
    }

    public void setBookAuthor() {
        getbookAuthor();
    }

    public void setBookISBN() {
        getbookISBN();
    }
}