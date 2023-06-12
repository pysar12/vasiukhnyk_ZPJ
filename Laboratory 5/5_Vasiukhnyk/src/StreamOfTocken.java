import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOfTocken {
    public boolean isWord(String input) {
        return input.chars().allMatch(Character::isLetter);
    }

    public static void main(String[] args) {
        StreamOfTocken task = new StreamOfTocken();
        try {
            List<String> lines = Files.readAllLines(Paths.get("file.txt"));

            lines.stream()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .filter(task::isWord)
                    .limit(100)
                    .forEach(System.out::println);

            Map<String, Long> wordFrequency = lines.stream()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .map(String::toLowerCase)
                    .filter(task::isWord)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            wordFrequency.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10)
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
