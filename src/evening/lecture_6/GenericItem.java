// Created by Dayu Wang (dwang@stchas.edu) on 2021-04-24

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-03-29


package evening.lecture_6;

public class GenericItem {
    // Data fields
    private String name;
    private int quantity;

    // Constructors

    public GenericItem() { setName(""); }  // Default constructor

    public GenericItem(String name, int quantity) {
        setName(name);
        setQuantity(quantity);
    }

    // Getters

    public String getName() { return name; }

    public int getQuantity() { return quantity; }

    // Setters

    public void setName(String name) { this.name = name; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Method

    /** Converts the object to a string for output.
        @return: a string converted from the object
    */
    public String convertToString() { return String.format("Name: %s\nQuantity: %d\n", getName(), getQuantity()); }
}