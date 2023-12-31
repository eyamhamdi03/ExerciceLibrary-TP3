package library;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> availablebooks;

    public Library() {
        this.availablebooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        availablebooks.add(book);
    }

    public void removeBook(Book book) {
        availablebooks.remove(book);
    }

    public void listAllavailablebooks() {
        for (Book book : availablebooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
    public void borrowBook(Student student, Book book) {
        
        }
    }

