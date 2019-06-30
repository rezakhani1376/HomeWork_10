import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) {
        List<String> asList = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza", "Mohsen");
        // a
        Map<Integer, List<String>> listMap_A = asList.stream()
                .collect(groupingBy(String::length));

        System.out.println(listMap_A);
        //b
        Map<Integer, Long> ListMap_b = asList.stream()
                .collect(groupingBy(String::length, counting()));
        System.out.println(ListMap_b);


    }

}
