package library;
import java.util.List;
import java.util.ArrayList;

public class Student implements LibraryUSer {
    private int borrowedBooksLimit;
    private List<Book> borrowedBooks;
    private LibraryCard libraryCard;

    public Student(int limit) {
        this.borrowedBooksLimit = limit;
        this.borrowedBooks = new ArrayList<>();
        libraryCard=new LibraryCard();
    }

    public void borrowBook(Book book) {
       
    }

    public void returnBook(Book book) {
        // Logic to return a book
    }
}