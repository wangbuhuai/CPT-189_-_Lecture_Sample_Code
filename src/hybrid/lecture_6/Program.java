// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-13

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.lecture_6;

public class Program {
    public static void main(String[] args) {
        Rectangle rect_1 = new Rectangle(2, 8);
        Rectangle rect_2 = new Rectangle(4, 5);
        Rectangle rect_3 = new Rectangle(10, 2);
        Rectangle rect_4 = new Rectangle(3, 6);

        Pair<Rectangle, Rectangle> p1 = new Pair<>(rect_1, rect_3);
        Pair<Rectangle, Rectangle> p2 = new Pair<>(rect_2, rect_4);

        // Specify the compare method.
        ItemComparator<Pair<Rectangle, Rectangle>> comparator = new ItemComparator<Pair<Rectangle, Rectangle>>() {
            /** Compares two Pair objects by comparing their {first} values first,
                then, if they are equal, by their {second} values.
                @param obj1: first pair to compare
                @param obj2: second pair to compare
                @return: a negative integer if the first pair is smaller than the second pair;
                         a positive integer if the second pair is smaller than the first pair;
                         {0} if the two pairs are equal
            */
            @Override
            public int compare(Pair<Rectangle, Rectangle> obj1, Pair<Rectangle, Rectangle> obj2) {
                if (obj1.getSecond().compareTo(obj2.getSecond()) < 0) { return -1; }
                else if (obj1.getSecond().compareTo(obj2.getSecond()) > 0) { return 1; }
                else { return obj1.getFirst().compareTo(obj2.getFirst()); }
            }
        };

        if (p1.compareTo(p2, comparator) < 0) {
            System.out.println("{p1} is smaller.");
        } else if (p1.compareTo(p2, comparator) > 0) {
            System.out.println("{p2} is smaller.");
        } else {
            System.out.println("{p1} and {p2} are equal.");
        }
    }
}