import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) {
        List<String> asList = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza", "Mohsen");

        Map<Integer, List<String>> listMap = asList.stream()
                .collect(groupingBy(String::length));

        System.out.println(listMap);
        

    }

}
