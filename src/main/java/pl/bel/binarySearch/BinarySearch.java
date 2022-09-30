package pl.bel.binarySearch;

import java.util.*;

public class BinarySearch {
    /**
        Реализация бмнарного поиска
     */
    public static void main(String[] args) {

        BinarySearch na = new BinarySearch();
        na.req();
    }

    public void req() {
        Set<String> name = new HashSet<>();
        name.add("Vlad");
        name.add("Minsk");
        name.add("Minsk");
    }

    static class Binary {
        public int getValueFromArrayOurElement(int [] array, int findNumber) {
            int low = 0;
            int high = array.length - 1;
            while (low <= array.length) {
                int mid = high + low;
                int guess = array [mid];
                if (guess == findNumber) {
                    return mid;
                }
                else if (guess > findNumber) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            return 0;
        }
    }
}
