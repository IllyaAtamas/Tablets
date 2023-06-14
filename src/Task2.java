import java.util.*;
import java.util.stream.*;

class Task2 implements StringSorter {
    @Override
    public List<String> sortAndUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}