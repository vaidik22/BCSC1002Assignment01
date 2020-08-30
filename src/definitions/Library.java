package definitions;

import java.util.Arrays;

public class Library {
    private static final int MAXIMUM_BOOKS_IN_LIBRARY = 5;
    private Book[] available;

    public Library() {
        this.available= new Book[MAXIMUM_BOOKS_IN_LIBRARY];
        for (int i = 0; i < MAXIMUM_BOOKS_IN_LIBRARY; i++) {
            available[i] = new Book();
        }
    }

    public Library(Book[] available) {
        this.available= available;
    }

    public Book[] getAvailableBooks() {
        return available;
    }

    public void setAvailable(Book[] available) {
        this.available= available;
    }


    @Override
    public String toString() {
        return "availableBooks=" + Arrays.toString(available) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(available, library.available);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(available);
    }

    /**
     * This method will set the Information of books available in Library.
     */
    public void setBooksInLibrary() {
        available[0].setBookName("The Guide");
        available[0].setBookAuthorName("RK Narayan");
        available[0].setIsbnNumber("9352836537000");
        available[1].setBookName("Cry, The Peacock");
        available[1].setBookAuthorName("Nirad C");
        available[1].setIsbnNumber("9353062012000");
        available[2].setBookName("Train to Pakistan");
        available[2].setBookAuthorName("Kiran Desai");
        available[2].setIsbnNumber("9789332582705");
        available[3].setBookName("Fundamental of Software Engineering");
        available[3].setBookAuthorName("Rajib Mall");
        available[3].setIsbnNumber("9789388028028");
        available[4].setBookName("Serpent and the Rope");
        available[4].setBookAuthorName("Raja Rao");
        available[4].setIsbnNumber("9351199258111");
    }

    /**
     * This method will show the Information of books available in Library.
     */
    public void showAvailableBooks() {
        System.out.println("****************************");
        System.out.printf("%-36s %-21s %-21s\n", "Book Name", "Author Name", "ISBN Number");
        System.out.println("*****************************");
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            System.out.printf("%-36s %-21s %-21s\n", available[libraryIndex].getBookName(), available[libraryIndex].getBookAuthor(), available[libraryIndex].getBookISBN());
        }
        System.out.println("****************************");
    }
}