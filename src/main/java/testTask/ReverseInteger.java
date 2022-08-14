package testTask;

import java.util.Enumeration;

/**
 * Created by Vladislav Domaniewski
 */

public class ReverseInteger {
    public static void main(String[] args) {
        CheckNumberAtIntValue num = new CheckNumberAtIntValue();
        num.reverse(-214748363);
    }
}

class CheckNumberAtIntValue{
    public int reverse(int x) {
        double min = Math.pow(-2, 31);
        double max = Math.pow(2, 31) - 1;
        if (min <= x || x >= max) {
            if (x < 0) {
                int actual = -(x);
                String num = String.valueOf(actual);
                StringBuilder stringBuilder = new StringBuilder(num)
                        .reverse();
                String str = "-" + stringBuilder;
                int finalNumber = Integer.parseInt(str);
                System.out.println(finalNumber);
                return finalNumber;
            } else {
                String num = String.valueOf(x);
                StringBuilder stringBuilder = new StringBuilder(num)
                        .reverse();
                String str =  stringBuilder.toString();
                int finalNumber = Integer.parseInt(str);
                System.out.println(finalNumber);
                return finalNumber;
            }
        } else {
            return 0;
        }
    }
}
