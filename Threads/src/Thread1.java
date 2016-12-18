/**
 * Created by User on 11.12.2016.
 */
public class Thread1 implements Runnable {

    @Override
    public void run() {

        Id("Thread1");
    }

    public synchronized void Id(String name){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+ " Id");
    }

}
