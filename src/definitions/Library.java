package definitions;
import java.util.Arrays;
public class Library {
    public Book[] available;
    public Library() {
        this.available = new Book[10];
        for (int i = 0; i < this.available.length; i++) {
            System.out.println("book name" + (i + 1));
        }
    }

    public Library(Book[] name) {
        this.available = name;
    }
    public Book[] getAvailable()
    {
        return available.clone();
    }
    public void setAvailable(Book[] available)
    {
        this.available = available;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailable());

    }

    public void available() {
        getAvailable();
    }

}