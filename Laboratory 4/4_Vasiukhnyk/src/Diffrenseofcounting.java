import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

    public class Diffrenseofcounting {
        public static void main(String[] args) throws IOException {
            String content = new String(Files.readAllBytes(Paths.get("war_and_peace.txt")), StandardCharsets.UTF_8);
            List<String> words = List.of(content.split("\\PL+"));
            long start, end;
    long count1, count2;
    start = System.currentTimeMillis();
    count1 = words.stream()
            .filter(word -> word.length() > 12)
            .count();
    end = System.currentTimeMillis();

    System.out.println("Duration : " + (end - start) + " мс");
    System.out.println("Number of long words (stream) : " + count1);

    start = System.currentTimeMillis();
    count2 = words.parallelStream()
            .filter(word -> word.length() > 12)
            .count();
    end = System.currentTimeMillis();

    System.out.println("The duration of the parallel stream : " + (end - start) + " мс");
    System.out.println("Number of long words (parallel stream): " + count2);
}
}
