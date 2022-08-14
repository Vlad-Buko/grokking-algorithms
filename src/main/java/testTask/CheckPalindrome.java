package testTask;


/**
 * Created by Vladislav Domaniewski
 */

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Check number for palindrome");
        Solution solution = new Solution();
        System.out.println(solution.checkNumberPalindrome(12121));

    }
}

class Solution {
    public Boolean checkNumberPalindrome(int x) {
        String num = String.valueOf(x);
        StringBuilder checkString = new StringBuilder(num).reverse();
        String actual = checkString.toString();
        if (num.equals(actual)) {
            return true;
        } else {
            return false;
        }
    }
}
