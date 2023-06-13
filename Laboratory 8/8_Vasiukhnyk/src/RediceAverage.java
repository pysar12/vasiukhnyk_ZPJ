//Exercise 15
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class RediceAverage {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.of(1.5, 2.3, 3.7, 4.1, 5.9);

        double average = stream
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average : " + average);
    }
}




