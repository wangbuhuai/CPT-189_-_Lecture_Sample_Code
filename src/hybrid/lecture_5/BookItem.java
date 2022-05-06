// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-30

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.lecture_5;

public class BookItem extends GenericItem {
    // Data field
    private String isbn;  // Stores the ISBN of the book

    // Constructor

    public BookItem() {  // Default constructor
        super();
        setIsbn("");
    }

    public BookItem(String name, int quantity, String isbn) {
        super(name, quantity);
        setIsbn(isbn);
    }

    // Getter

    /** Returns the ISBN of the book.
        @return: ISBN of the book
    */
    public String getIsbn() { return isbn; }

    // Setter

    /** Updates the ISBN of the book.
        @param isbn: updated ISBN of the book
    */
    public void setIsbn(String isbn) { this.isbn = isbn; }

    // Method

    /** Converts the book to a string for output.
        @return: a string representing the book
    */
    @Override
    public String convertToString() {
        return String.format("%s\nISBN: %s", super.convertToString(), getIsbn());
    }
}