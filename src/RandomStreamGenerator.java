import java.util.*;
import java.util.stream.*;
interface RandomStreamGenerator {
    Stream<Long> generateRandomStream(long seed, long a, long c, long m);
}