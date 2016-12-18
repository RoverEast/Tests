/**
 * Created by User on 09.12.2016.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {

        int size = 10;
        FirstThread firstThread = new FirstThread();

        Thread secondThread = new Thread(new SecondThread());

        firstThread.start();
        secondThread.start();

        for(int i = 0; i < size; i++){

            System.out.println("Main thread");
            Thread.sleep(1);
        }
    }
}
