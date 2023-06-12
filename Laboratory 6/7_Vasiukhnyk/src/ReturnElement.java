
//Exercise 13
import java.util.stream.Stream;
        import java.util.Iterator;

public class ReturnElement {
    public static <T> Stream<T> zip(Stream<T> FIRST, Stream<T> SECOND) {
        Iterator<T> FirstIterator = FIRST.iterator();
        Iterator<T> SecondIterator = SECOND.iterator();
        Stream.Builder<T> builder = Stream.builder();

        while (FirstIterator.hasNext() && SecondIterator.hasNext()) {
            builder.accept(FirstIterator.next());
            builder.accept(SecondIterator.next());
        }
        return builder.build();
    }
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("A", "B", "C");
        Stream<String> stream2 = Stream.of("X", "Y", "Z");
        Stream<String> zippedStream = zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}

