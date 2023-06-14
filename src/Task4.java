import java.util.*;
import java.util.stream.*;

class Task4 implements RandomStreamGenerator {
    @Override
    public Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
}