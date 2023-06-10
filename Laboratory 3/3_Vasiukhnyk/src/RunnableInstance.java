import java.util.Arrays;
public class RunnableInstance {
    public static Runnable InSequence(Runnable... tasks) {
        return () -> Arrays.stream(tasks).forEach(Runnable::run);
    }
    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("Runnable 1");
        Runnable runnable2 = () -> System.out.println("Runnable 2");
        Runnable runnable3 = () -> System.out.println("Runnable 3");

        Runnable[] runnables = {runnable1, runnable2, runnable3};

        Runnable combinedRunnable = InSequence(runnables);
        combinedRunnable.run();
    }
}