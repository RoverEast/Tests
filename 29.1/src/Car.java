/**
 * Created by User on 08.12.2016.
 */
public class Car extends Light{
    Light light = new Light();
    Tank tank = new Tank();

    public void workTime(){

        System.out.println("Машина в движении");
        light.lightOn();
        tank.petrolKeeper();
    }
}
