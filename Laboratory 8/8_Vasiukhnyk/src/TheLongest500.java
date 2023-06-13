//Exercise 17
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class TheLongest500 {
    public static void main(String[] args) {
        String text = "War and Peace. W każdym człowieku istnieją dwa aspekty życia: " +
                "życie osobiste, które jest tym bardziej wolne, im bardziej abstrakcyjne " +
                "są jego zainteresowania, oraz życie spontaniczne, rojowe, w którym człowiek " +
                "nieuchronnie wypełnia przypisane mu prawa.";
        Arrays.stream(text.split("\n"))
                .parallel()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(500)
                .forEach(System.out::println);
    }
}
