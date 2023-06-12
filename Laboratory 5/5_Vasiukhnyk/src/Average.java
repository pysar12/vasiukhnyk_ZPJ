
import java.util.stream.Stream;

public class Average {
    public static void main(String[] args) {
        long counter = 5;
        Stream<Double> doubleStream = Stream.of(5.0, 10.0, 15.0, 20.0, 35.0);
        double sum = doubleStream.reduce(0.0, Double::sum);
        double AverageResult = sum / counter;
        System.out.println("Average value: " + AverageResult);
    }
}
