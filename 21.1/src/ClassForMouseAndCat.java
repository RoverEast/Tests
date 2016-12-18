/**
 * Created by User on 05.12.2016.
 */
public class ClassForMouseAndCat implements Mouse, Cat{

    @Override
    public void color() {
        System.out.println("I have my own color");
    }

    public void name (){
        System.out.println("My name is Jerry");
    }

    @Override
    public void CatName() {
        System.out.println("My name is Tom");
    }
}
