import java.util.*;
import java.util.stream.*;
interface StreamZipper {
    <T> Stream<T> zip(Stream<T> first, Stream<T> second);
}