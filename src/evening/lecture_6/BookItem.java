// Created by Dayu Wang (dwang@stchas.edu) on 2021-04-24

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-03-29


package evening.lecture_6;

public class BookItem extends GenericItem {
    // Data field
    private String isbn;

    // Constructors

    public BookItem() {  // Default constructor
        super();
        setIsbn("");
    }

    public BookItem(String name, int quantity, String isbn) {
        super(name, quantity);
        setIsbn(isbn);
    }

    // Getter
    public String getIsbn() { return isbn; }

    // Setter
    public void setIsbn(String isbn) { this.isbn = isbn; }

    // Method
    @Override
    public String convertToString() { return String.format("%sISBN: %s\n", super.convertToString(), getIsbn()); }
}