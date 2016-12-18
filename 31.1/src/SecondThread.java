/**
 * Created by User on 09.12.2016.
 */
public class SecondThread implements Runnable {

    private int size = 10;

    @Override
    public void run() {
        for(int i = 0; i < size; i++){

            System.out.println("Second thread");
        }
    }
}
