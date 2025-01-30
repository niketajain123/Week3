package doublylinkedlist.librarymanagementsystem;

import java.awt.print.Book;

public class BookNode {
    private String bookTitle;
    private String author;
    private String genre;
    private final int id;
    private boolean availabilityStatus;
    private BookNode next;
    private BookNode prev;

    public BookNode(String bookTitle, String author, String genre, int id, boolean availabilityStatus) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Book Title=" + bookTitle +
                "\nAuthor=" + author +
                "\nGenre=" + genre +
                "\nID=" + id +
                "\nAvailability Status=" + availabilityStatus ;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public BookNode getNext() {
        return next;
    }

    public void setNext(BookNode next) {
        this.next = next;
    }

    public BookNode getPrev() {
        return prev;
    }

    public void setPrev(BookNode prev) {
        this.prev = prev;
    }
}
