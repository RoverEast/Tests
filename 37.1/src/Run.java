import java.util.ArrayList;

/**
 * Created by User on 13.12.2016.
 */
public class Run {

    public static void main(String[] args) {

        ArrayList<String> Cars = new ArrayList<String>();
        final int numberOfCars = 10;
        for(int i = 0; i <numberOfCars; i++) {
            Cars.add("Наша модель " + i);
        }



        System.out.println(Cars.size());

        /*for(int i = 0; i < Cars.size(); i++) {
            System.out.println(Cars.get(i));
        }*/

        for(int i = 0; i <Cars.size()/2; i++) {
            Cars.set(i, "Забугорная модель" + i);
        }

        /*for(int i = 0; i < Cars.size(); i++) {
            System.out.println(Cars.get(i));
        }*/

        Cars.remove(0);
        Cars.remove(0);
        Cars.remove(6);
        Cars.remove(6);

        /*for(int i = 0; i < Cars.size(); i++) {
            System.out.println(Cars.get(i));
        }*/

        Cars.add(3, "Your choise");

        for(int i = 0; i < Cars.size(); i++) {
            System.out.println(Cars.get(i));
        }

    }


}
