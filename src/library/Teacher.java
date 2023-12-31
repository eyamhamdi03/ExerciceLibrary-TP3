package library;

import java.util.List;

public class Teacher implements LibraryUSer {
	private int borrowedBooksLimit;
    private List<Book> borrowedBooks;
    private LibraryCard libraryCard;


    public Teacher() {
        this.libraryCard = new LibraryCard();
    }

    public void borrowBook(Book book) {
    }

    public void returnBook(Book book) {
    }
}