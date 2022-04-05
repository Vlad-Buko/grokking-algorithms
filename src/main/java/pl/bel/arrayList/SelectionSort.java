package pl.bel.arrayList;

public class SelectionSort {

    public static void main(String[] args) {
        int [] startArray = new int[] {5, 7, 1, 4};
        SortArray sortArray = new SortArray();
        sortArray.sortArray(startArray);
    }
}

class SortArray {

    public void sortArray(int [] arrayStart) {
        int value = 0;
        for (int i = 0; i < arrayStart.length; i++) {
            for (int j = i+1; j < arrayStart.length; j++) {
                if(arrayStart[i] > arrayStart[j]) {
                    value = arrayStart[i];
                    arrayStart[i] = arrayStart[j];
                    arrayStart[j] = value;
                }
            }
            System.out.println(arrayStart[i]);
        }
    }
}
