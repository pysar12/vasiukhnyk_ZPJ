
import java.util.Comparator;
        import java.util.List;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;

public class TheLongest {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("abc", "defgh", "ijkl", "mnopqrs", "tuv", "wxyz");

        List<String> longestStrings = stringStream
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(e -> e.getKey()))
                .map(e -> e.getValue())
                .orElse(List.of());

        System.out.println("Longest strings: " + longestStrings);
    }
}
