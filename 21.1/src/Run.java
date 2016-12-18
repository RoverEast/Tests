/**
 * Created by User on 05.12.2016.
 */
public class Run {
    public static void main(String[] args) {
        ClassForMouseAndCat classForMouseAndCat = new ClassForMouseAndCat();

        classForMouseAndCat.color();
        classForMouseAndCat.name();
        classForMouseAndCat.CatName();
        System.out.println("~~~~~~~~~~~");
        Mouse polymorphMouse = new ClassForMouseAndCat();

        polymorphMouse.color();
        System.out.println("~~~~~~~~~~~");

        Cat polymorphCat = new ClassForMouseAndCat();

        polymorphCat.CatName();
    }
}
