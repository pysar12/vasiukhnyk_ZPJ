//Exercise 18
import java.util.Arrays;
import java.util.stream.Stream;

public class DeleteDuplicates {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 2, 3, 4, 4, 5, 5, 5, 6);
        stream.reduce((prev, curr) -> {
            if (!prev.equals(curr)) {
                System.out.println(prev);
            }
            return curr;
        }).ifPresent(System.out::println);
    }
}
