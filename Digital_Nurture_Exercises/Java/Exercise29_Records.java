import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordDemo {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 17)
        );

        System.out.println("All People:");
        people.forEach(System.out::println);

        System.out.println("\nPeople aged 18+ :");
        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}
