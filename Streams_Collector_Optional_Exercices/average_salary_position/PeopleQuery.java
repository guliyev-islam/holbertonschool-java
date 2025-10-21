import java.util.*;
import java.util.stream.Collectors;

public class PeopleQuery {
    public static TreeMap<String, TreeSet<Person>> getPeopleGroupedByPositionInReverseOrder(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getPosition, () -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Person::getName)))));
    }

    public static Map<String, Long> getPeopleCountByPosition(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getPosition, Collectors.counting()));
    }

    public static Map<String, Map<Integer, Long>> getPeopleCountByPositionAndAge(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getPosition, Collectors.groupingBy(Person::getAge, Collectors.counting())));
    }

    public static Map<String, Double> getAverageSalaryByPosition(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getPosition, Collectors.averagingDouble(Person::getSalary)));
    }
}