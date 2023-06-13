import java.util.*;
import java.util.stream.*;

public class Task3 {
    public static String extractAndSortNumbers(String[] array) {
        String numbers = Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
        return numbers;
    }
}