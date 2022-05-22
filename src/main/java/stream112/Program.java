package stream112;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<People> listPerson = new ArrayList<>();
        listPerson.add(new People(12,  "Vova"));
        listPerson.add(new People(17,  "Mali"));
        listPerson.add(new People(11,  "Masha"));
        listPerson.add(new People(24,  "Kate"));
        listPerson.add(new People(18,  "Svoya"));

        double average = listPerson.stream().
                filter(p -> p.getAge() >= 14).
                mapToInt(p -> p.getAge())
                        .average().getAsDouble();
        System.out.println(average);
    }
}
