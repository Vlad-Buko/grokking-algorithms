package haschCodeContractWithEquals;

/**
 * Created by Vladislav Domaniewski
 */

public class AppClient {


    public static void main(String[] args) {
        String name1 = "Vladi";
        String name2 = "V" + "l" + "a" + "di";

        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2);
    }
}
