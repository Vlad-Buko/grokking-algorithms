package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Vladislav Domaniewski
 */

public class Interview {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(9);
        nums.add(1);
        nums.add(2);

        List <Integer> numsSecond = new ArrayList<>();
        numsSecond.add(2);
        numsSecond.add(6);
        numsSecond.add(9);
        numsSecond.add(8);

        System.out.println(Solution.numRet(nums, numsSecond));
    }
}


class Solution {
    public static List <Integer> numRet(List <Integer> getNums, List <Integer> secondGetNums) {
        List<Integer> withoutRepeatNumbers = getNums.stream().distinct().collect(Collectors.toList());

        List <Integer> twoList = new ArrayList<>();

        twoList.addAll(secondGetNums);
        twoList.addAll(withoutRepeatNumbers);

        List<Integer> finishList =  twoList.stream().distinct().collect(Collectors.toList());
        return finishList;
    }
}
