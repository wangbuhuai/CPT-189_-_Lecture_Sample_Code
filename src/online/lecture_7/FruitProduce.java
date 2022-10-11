// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-30

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package online.lecture_7;

public class FruitProduce extends ProduceItem {
    // Data field
    private boolean hasSeed;  // {true} if the fruit has seed; {false} otherwise

    // Constructors

    public FruitProduce() { super(); }  // Default constructor

    public FruitProduce(String name, int quantity, String expirationDate, boolean hasSeed) {
        super(name, quantity, expirationDate);
        setHasSeed(hasSeed);
    }

    // Getter

    /** Returns whether the fruit has seed.
        @return: {true} if the fruit has seed; {false} otherwise
    */
    public boolean getHasSeed() { return hasSeed; }

    // Setter

    /** Updates whether the fruit has seed.
        @param hasSeed: updated value of whether the fruit has seed
    */
    public void setHasSeed(boolean hasSeed) { this.hasSeed = hasSeed; }

    // Method

    /** Converts the fruit to a string for output.
        @return: a string representing the fruit
    */
    @Override
    public String convertToString() {
        return String.format("%s\nHas seed: %s", super.convertToString(), getHasSeed());
    }
}