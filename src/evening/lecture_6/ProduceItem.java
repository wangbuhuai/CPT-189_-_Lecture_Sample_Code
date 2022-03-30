// Created by Dayu Wang (dwang@stchas.edu) on 2021-04-24

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-03-29


package evening.lecture_6;

public class ProduceItem extends GenericItem {
    // Data field
    private String expirationDate;

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
    public String getExpirationDate() { return expirationDate; }

    // Setter
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }

    // Method
    @Override
    public String convertToString() {
        return String.format("%sExpiration Date: %s\n", super.convertToString(), getExpirationDate());
    }
}