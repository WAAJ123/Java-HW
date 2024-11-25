public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean checkedOut;

    public Book(String userTitle, String userAuthor, int userYear) {
        title = userTitle;
        author = userAuthor;
        yearPublished = userYear;
        checkedOut = false;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void returnBook() {
        checkedOut = false;
    }
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Checked Out: " + checkedOut);
    }
}