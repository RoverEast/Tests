/**
 * Created by User on 09.12.2016.
 */
public class FirstThread extends Thread{

    int size = 10;
    public void Run() {
        for (int i = 0; i < size; i++){

            System.out.println("First thread");
        }
    }

}
