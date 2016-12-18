/**
 * Created by User on 05.12.2016.
 */
public class Run {
    public static void main(String[] args) {

        DeutchCat deutchCat = new DeutchCat();

        deutchCat.ID();
        deutchCat.age();
        deutchCat.family();
        System.out.println("~~~~~~~~~~");

        Cat polymorphCat = new DeutchCat();

        polymorphCat.age();
        polymorphCat.ID();
    }
}
