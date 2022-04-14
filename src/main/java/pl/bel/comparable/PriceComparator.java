package pl.bel.comparable;

import java.util.Comparator;

public class PriceComparator implements Comparator <Motor> {
    @Override
    public int compare(Motor o1, Motor o2) {
        if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
