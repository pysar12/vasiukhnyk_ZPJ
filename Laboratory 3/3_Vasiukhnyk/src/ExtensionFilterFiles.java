import java.util.Arrays;
import java.io.File;
import java.io.FilenameFilter;

public class ExtensionFilterFiles {
    public static void main(String[] args) {
        File DIRECT = new File("DIRECTORY");
        String extension = ".txt";

        String[] files = DIRECT.list((dir, name) -> name.endsWith(extension));
        System.out.println(Arrays.toString(files));
    }
}