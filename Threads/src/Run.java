/**
 * Created by User on 11.12.2016.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {

        Thread1 thread1 = new Thread1();
        Thread thread = new Thread(thread1);

        thread.start();
        Thread.sleep(5);
        thread1.Id("Main");
    }
}
