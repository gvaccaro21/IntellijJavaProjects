/**
 * Created by Giuseppe on 4/30/2014.
 */
import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) {
        // Create a fixed thread pool with maximum three threads
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // Submit runnable tasks to the executor
        executor.execute(new PrintChar('a', 100));
        executor.execute(new PrintChar('b', 100));
        executor.execute(new PrintChar('c', 100));
        executor.execute(new PrintChar('d', 100));
        executor.execute(new PrintChar('e', 100));
        executor.execute(new PrintChar('f', 100));
        executor.execute(new PrintChar('g', 100));
        executor.execute(new PrintNum(600));
        // Shut down the executor
        executor.shutdown();
    }
}
