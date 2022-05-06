// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-30

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.lecture_5;

public class ProduceItem extends GenericItem {
    // Data field
    private String expirationDate;  // Stores the expiration date of the produce.

    // Constructors

    public ProduceItem() {  // Default constructor
        super();
        setExpirationDate("");
    }

    public ProduceItem(String name, int quantity, String expirationDate) {
        super(name, quantity);
        setExpirationDate(expirationDate);
    }

    // Getter

    /** Returns the expiration date of the produce.
        @return: expiration date of the produce
    */
    public String getExpirationDate() { return expirationDate; }

    // Setter

    /** Updates the expiration date of the produce.
        @param expirationDate: updated expiration date of the produce
    */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    // Method

    /** Converts the produce to a string for output.
        @return: a string representing the produce
    */
    @Override
    public String convertToString() {
        return String.format("%s\nExpiration date: %s", super.convertToString(), getExpirationDate());
    }
}