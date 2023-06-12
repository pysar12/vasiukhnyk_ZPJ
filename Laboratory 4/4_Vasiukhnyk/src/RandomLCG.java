import java.util.stream.Stream;
public class RandomLCG {
    public static Stream<Long> generateRandomStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = 248L;
        long seed = 0L;

        Stream<Long> randomStream = generateRandomStream(a, c, m, seed);
        randomStream.limit(10).forEach(System.out::println);
    }
}
