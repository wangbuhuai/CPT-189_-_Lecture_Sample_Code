// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-30

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.lecture_5;

public class GenericItem {
    // Data fields
    private String name;  // Stores the name of the item.
    private int quantity;  // Stores the quantity of the item.

    // Constructors

    public GenericItem() { setName(""); }  // Default constructor

    public GenericItem(String name, int quantity) {
        setName(name);
        setQuantity(quantity);
    }

    // Getters

    /** Returns the name of the item.
         @return: name of the item
    */
    public String getName() { return name; }

    /** Returns the quantity of the item.
        @return: quantity of the item
    */
    public int getQuantity() { return quantity; }

    // Setters

    /** Updates the name of the item.
        @param name: updated name of the item
    */
    public void setName(String name) { this.name = name; }

    /** Updates the quantity of the item.
        @param quantity: updated quantity of the item
    */
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Method

    /** Converts the item to a string for output.
        @return: a string representing the item
    */
    public String convertToString() {
        return String.format("Name: %s\nQuantity: %d", getName(), getQuantity());
    }
}