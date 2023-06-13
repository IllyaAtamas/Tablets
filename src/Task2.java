import java.util.*;
import java.util.stream.*;

public class Task2 {
    public static List<String> sortAndUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}