import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class AverageLength {
    public static void main(String[] args) {
        Stream<String> AverageStream = Stream.of("university", "mark", "student", "classroom");
        DoubleSummaryStatistics informat = AverageStream.mapToDouble(String::length).summaryStatistics();
        double averageLength = informat.getAverage();
        System.out.println("Average length: " + averageLength);
    }
}
