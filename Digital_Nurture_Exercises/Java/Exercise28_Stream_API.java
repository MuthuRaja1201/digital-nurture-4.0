import java.util.*;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 23, 34, 45, 50, 67, 88);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even numbers:");
        evenNumbers.forEach(System.out::println);
    }
}
