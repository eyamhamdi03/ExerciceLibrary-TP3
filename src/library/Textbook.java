package library;


public class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, int yearOfPublication, String subject) {
        super(title, author, yearOfPublication);
        this.subject = subject;
    }

    public void displayInformation() {
        // Display specific information for a textbook
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Publication: " + getYearOfPublication());
        System.out.println("Subject: " + subject);
    }
}