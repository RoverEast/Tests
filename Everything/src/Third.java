/**
 * Created by User on 17.12.2016.
 */
public class Third extends AbstractClass implements ForAbstract, Runnable {

    public String s1 = "asd";
    public String s2 = "asd";

    public void Compare(){
        if(s1.equals(s2)){

            System.out.println("OK");
        } else{
            System.out.println("Not OK");
        }
    }

    @Override
    void AC() {

        System.out.println("AC");
    }

    @Override
    public void interf() {

        System.out.println("interf");
    }

    @Override
    public void run() {

    }

}
