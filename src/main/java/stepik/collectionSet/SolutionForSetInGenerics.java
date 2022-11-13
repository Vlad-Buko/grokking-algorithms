package stepik.collectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Vladislav Domaniewski
 */

public class SolutionForSetInGenerics {
        public static void main(String[] args) {

            Set<Integer> num1 = new HashSet<>();
            num1.add(3);
            num1.add(7);
            num1.add(9);

            HashSet<Integer> num2 = new HashSet<>();
            num2.add(5);
            num2.add(7);
            num2.add(12);

            Set<Integer> resutl = symmetricDifference(num1, num2);
            System.out.println(resutl);
        }

        public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

            Set<T> set = new HashSet<>();
            set.addAll(set1);
            set.addAll(set2);
            Iterator<T> it = set.iterator();

            while (it.hasNext()) {
                T item = it.next();
                if (set1.contains(item) && set2.contains(item)) {
                    it.remove();
                }
            }
            return set;
        }
}
