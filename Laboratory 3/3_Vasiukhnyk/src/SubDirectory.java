 //Exercise 11
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

    public class SubDirectory {
        public static File[] getSubdirectoriesWithLambda(String directoryPath) {
            File directory = new File(directoryPath);

            return directory.listFiles(file -> file.isDirectory());
        }
        public static File[] getSubdirectoriesWithMethodReference(String directoryPath) {
            File directory = new File(directoryPath);

            return directory.listFiles(File::isDirectory);
        }
        public static File[] getSubdirectoriesWithAnonymousInnerClass(String directoryPath) {
            File directory = new File(directoryPath);

            return directory.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.isDirectory();
                }
            });
        }
        public static void main(String[] args) {
            String directoryPath = "Your Katalog";
            File[] subdirectoriesLambda = getSubdirectoriesWithLambda(directoryPath);
            if (subdirectoriesLambda != null) {
                System.out.println("Subdirectories with lambda:");
                for (File subdirectory : subdirectoriesLambda) {
                    System.out.println(subdirectory.getAbsolutePath());
                }
            }
            File[] subdirectoriesMethodRef = getSubdirectoriesWithMethodReference(directoryPath);
            if (subdirectoriesMethodRef != null) {
                System.out.println("Subdirectories with method reference:");
                for (File subdirectory : subdirectoriesMethodRef) {
                    System.out.println(subdirectory.getAbsolutePath());
                }
            }
            File[] subdirectoriesAnonInnerClass = getSubdirectoriesWithAnonymousInnerClass(directoryPath);
            if (subdirectoriesAnonInnerClass != null) {
                System.out.println("Subdirectories with anonymous inner class:");
                for (File subdirectory : subdirectoriesAnonInnerClass) {
                    System.out.println(subdirectory.getAbsolutePath());
                }
            }
        }
    }
