package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vladislav Domaniewski
 */

public class SolutionForRomeNumberToInt {
    public static void main(String[] args) {
        // Просто вписываем значение Римскими, в эту строку
        // Дабы не добавлять сканер, просто в строку записываем
        String rome = "VL";

        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int result = 0;
        char[] input = rome.toCharArray();
        int len = input.length;
        for(int i=len-1;i>=0;i--){
            result += roman.get(input[i]);
            if(i!=0 && roman.get(input[i-1]) < roman.get(input[i])){
                result -= roman.get(input[i-1]);
                i--;
            }
        }
        System.out.println(result
        );

    }

}
