//Exercise 1
import java.util.Arrays;
import java.util.List;
public class FiveWordsFilter {
    public static void main(String[] args) {
        List<String> University = Arrays.asList("Mark", "Student", "Teacher", "Lesson", "Breacktime", "ClassRoom", "Project");
            long count = University.stream()
                .filter(word -> word.length() > 5)
                .peek(word -> {
                    if (word.length() > 5) {
                        System.out.println("The filter method was called after the fifth long word was found. ");
                    }
                })
                .count();

        System.out.println("The number of long words : " + count);
    }
}
