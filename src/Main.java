import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        //1
        List<String> names = Arrays.asList("Ivan", "Peter", "John", "Michael", "David");
        NameFormatter nameFormatter = new Task1();
        String formattedNames = nameFormatter.formatNames(names);
        System.out.println("Task 1: " + formattedNames);

        //2
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        StringSorter stringSorter = new Task2();
        List<String> sortedUpperCaseStrings = stringSorter.sortAndUpperCase(strings);
        System.out.println("Task 2: " + sortedUpperCaseStrings);

        //3
        String[] array = {"1, 2, 0", "4, 5"};
        NumberExtractor numberExtractor = new Task3();
        String sortedNumbers = numberExtractor.extractAndSortNumbers(array);
        System.out.println("Task 3: " + sortedNumbers);

        //4
        long seed = 123;
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        RandomStreamGenerator randomStreamGenerator = new Task4();
        Stream<Long> randomStream = randomStreamGenerator.generateRandomStream(seed, a, c, m);
        randomStream.limit(10).forEach(System.out::println);

        //5
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> secondStream = Stream.of(6, 7, 8);
        StreamZipper streamZipper = new Task5();
        Stream<Integer> zippedStream = streamZipper.zip(firstStream, secondStream);
        zippedStream.forEach(System.out::println);
    }
}