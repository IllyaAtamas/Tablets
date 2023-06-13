import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ivan", "Peter", "John", "Michael", "David");
        String formattedNames = Task1.formatNames(names);
        System.out.println("Task 1: " + formattedNames);


        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> sortedUpperCaseStrings = Task2.sortAndUpperCase(strings);
        System.out.println("Task 2: " + sortedUpperCaseStrings);


        String[] array = {"1, 2, 0", "4, 5"};
        String sortedNumbers = Task3.extractAndSortNumbers(array);
        System.out.println("Task 3: " + sortedNumbers);


        long seed = 123;
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        Stream<Long> randomStream = Task4.generateRandomStream(seed, a, c, m);
        randomStream.limit(10).forEach(System.out::println);


        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> secondStream = Stream.of(6, 7, 8);
        Stream<Integer> zippedStream = Task5.zip(firstStream, secondStream);
        zippedStream.forEach(System.out::println);
    }
}