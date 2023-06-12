import java.util.Arrays;
        import java.util.stream.IntStream;
        import java.util.stream.Stream;

public class IntValues {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16};
        Stream<int[]> ValuesStream = Stream.of(values);
        System.out.println("First stream: " + Arrays.toString(ValuesStream.toArray()));
        int n = 10;
        IntStream Valuestream = IntStream.rangeClosed(1, n);
        System.out.println("Second stream: " + Arrays.toString(Valuestream.toArray()));
    }
}