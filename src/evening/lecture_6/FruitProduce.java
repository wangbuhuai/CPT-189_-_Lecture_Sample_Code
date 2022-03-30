// Created by Dayu Wang (dwang@stchas.edu) on 2021-04-24

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-03-29


package evening.lecture_6;

public class FruitProduce extends ProduceItem {
    // Data field
    private boolean hasSeed;

    // Constructors

    public FruitProduce() { super(); }  // Default constructor

    public FruitProduce(String name, int quantity, String expirationDate, boolean hasSeed) {
        super(name, quantity, expirationDate);
        setHasSeed(hasSeed);
    }

    // Getter
    public boolean getHasSeed() { return hasSeed; }

    // Setter
    public void setHasSeed(boolean hasSeed) { this.hasSeed = hasSeed; }

    // Method
    @Override
    public String convertToString() { return String.format("%sHas Seed: %s\n", super.convertToString(), getHasSeed()); }
}