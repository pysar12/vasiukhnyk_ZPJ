//Excercise12
import java.util.stream.Stream;
import java.util.Spliterator;
import java.util.List;
import java.util.ArrayList;

public class IsFinite {
    public static <T> boolean isFinite(Stream<T> stream) {
        Spliterator<T> Value = stream.spliterator();
        return (Value.characteristics() & Spliterator.SIZED) != 0;
    }
    public static void main(String[] args) {
        Stream<Integer> finiteStream = Stream.of(1, 2, 3, 4, 5);
        //Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 1);
        System.out.println("isFinite(finiteStream): " + isFinite(finiteStream));
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        Stream<String> listStream = list.stream();
        System.out.println("isFinite(listStream): " + isFinite(listStream));
    }
}