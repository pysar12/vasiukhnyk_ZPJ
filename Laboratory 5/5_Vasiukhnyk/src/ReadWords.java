import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReadWords {
    public static void main(String[] args) throws IOException {
        List<String> words = Files.readAllLines(Paths.get("/usr/share/dict/words"));
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        List<String> wordsWithFiveVowels = words.stream()
                .filter(word -> countDistinctVowels(word, vowels) == 5)
                .collect(Collectors.toList());

        wordsWithFiveVowels.forEach(System.out::println);
    }

    private static int countDistinctVowels(String word, Set<Character> vowels) {
        return (int) word.toLowerCase().codePoints()
                .filter(Character::isAlphabetic)
                .mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .distinct()
                .count();
    }
}
