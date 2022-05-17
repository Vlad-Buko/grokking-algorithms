package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSomething {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vlad", "Aitya", "Vitya");

        System.out.println(names.stream().sorted().collect(Collectors.toList()));
    }
}
