package pl.bel.comparable;

import java.util.TreeSet;

public class StartApplication {
    public static void main(String[] args) {
        TreeSet<Motor> myMotorList = new TreeSet<>();
        Motor suzuki = new Motor(3, 3500, "Blue", true);
        Motor honda = new Motor(7, 3200, "Red", true);
        Motor harley = new Motor(2, 5400, "Gold - Yellow", false);
        myMotorList.add(suzuki);
        myMotorList.add(honda);
        myMotorList.add(harley);

        for (Motor m : myMotorList) {
            System.out.println(m);
        }
    }
}
