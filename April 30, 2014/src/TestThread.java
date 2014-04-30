/**
 * Created by Giuseppe on 4/30/2014.
 */
public class TestThread {

    public static void main(String args[]){

        RunnableDemo R1 = new RunnableDemo("Thread-1");

        RunnableDemo R2 = new RunnableDemo("Thread-2");

        Thread thread1 = new Thread(R1);
        Thread thread2 = new Thread(R2);

        thread1.start();
        thread2.start();
    }
}

class RunnableDemo implements Runnable{
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run(){
        System.out.println("Running " + threadName);

        for (int i = 4; i > 0; i--)
            System.out.println("Thread: " + threadName + ", " + i);

        System.out.println("Thread " + threadName + " exiting.");
    }

}
