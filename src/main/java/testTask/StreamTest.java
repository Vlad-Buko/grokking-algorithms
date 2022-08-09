package testTask;


import stream.Pers;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Vladislav Domaniewski
 */

public class StreamTest {
    public static void main(String[] args) {
        List<Person> name = new ArrayList<>();
        Person person1= new Person("Vlad", 12, Pilot.BIKER);
        Person person2= new Person("Viktor", 50, Pilot.RIDER);
        Person person3 = new Person("Mike", 21, Pilot.RIDER);
        name.add(person1);
        name.add(person2);
        name.add(person3);
        System.out.println(name);
        Collections.sort(name, (o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(name);

        List <Person> daf = name.stream()
                .filter(namePerson -> namePerson.getPilot().equals(Pilot.RIDER)).collect(Collectors.toList());

        System.out.println(daf);

        Person withMinAge = name.stream()
                .max(Comparator.comparing(Person::getAge)).orElse(null);

        System.out.println(withMinAge);
    }
}
