import java.util.*;
import java.util.stream.*;

public class Task4 {
    public static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
}