import java.util.*;
import java.util.stream.*;

public class Task1 {
    public static String formatNames(List<String> names) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            if (i % 2 == 0) {
                sb.append(i + 1).append(". ").append(names.get(i)).append(", ");
            }
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);  // Видалити останню кому та пробіл
        }
        return sb.toString();
    }
}