import java.util.*;
import java.util.stream.*;

class Task3 implements NumberExtractor {
    @Override
    public String extractAndSortNumbers(String[] array) {
        String numbers = Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
        return numbers;
    }
}