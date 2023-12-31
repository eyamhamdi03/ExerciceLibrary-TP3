package library;
public class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int yearOfPublication, String genre) {
        super(title, author, yearOfPublication);
        this.genre = genre;
    }

    public void displayInformation() {
        // Display specific information for a novel
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Publication: " + getYearOfPublication());
        System.out.println("Genre: " + genre);
    }
}

