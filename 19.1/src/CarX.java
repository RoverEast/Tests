/**
 * Created by User on 05.12.2016.
 */
public class CarX extends Car {
    private  int window;

    @Override
    public void Drive(){
        super.Drive();
        System.out.println("I drive Faster");
    }

    public void CruiseControle(){
        System.out.println("I have a Cruise Ctrl");
    }
}
