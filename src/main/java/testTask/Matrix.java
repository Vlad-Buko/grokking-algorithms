package testTask;

/**
 * Created by Vladislav Domaniewski
 */

public class Matrix {
    public static void main(String[] args) {
        int [][] anyList = {{1,5,2}
                            ,{3,9,6},
                             {3,6,1}};

        int sum = 0;
        int sum1 = 0;

        for (int i =0; i<anyList.length; i++){
            sum += anyList[i][i];
            sum1 += anyList[i][anyList.length - i - 1];
        }
        int res = sum + sum1;
        if (anyList.length % 2 != 0) {
            res -= anyList[anyList.length/2][anyList.length/2];
        }
        System.out.println(res);
    }
}
