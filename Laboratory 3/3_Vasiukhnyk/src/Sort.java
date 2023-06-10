import java.util.Comparator;
import java.io.File;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        File directory = new File("Directory");
        File[] files = directory.listFiles();

        Arrays.sort(files, Comparator.comparing(File::isDirectory, Comparator.reverseOrder())
                .thenComparing(File::getName));

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}