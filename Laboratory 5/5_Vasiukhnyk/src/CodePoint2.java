//Exercise 5
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class CodePoint2 {
    public Stream<String> codePoints(String input, int length) {
        return IntStream.iterate(0, i -> i < input.length(), i -> input.offsetByCodePoints(i, 1))
                .mapToObj(start -> input.substring(start, input.offsetByCodePoints(start, 1)));
    }

    public static void main(String[] args) {
        CodePoint2 exercise = new CodePoint2();
        String input = "abcdefghijklm";
        exercise.codePoints(input, 3).forEach(System.out::println);
    }
}
