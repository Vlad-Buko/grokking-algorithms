package pl.bel.binarySearch;

public class BinarySearch {


    public static void main(String[] args) {
        int [] array = new int[] {1, 3, 5, 7, 9};
        int find = 5;
        System.out.println(new Binary().getValueFromArrayOurElement(array, find));
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
