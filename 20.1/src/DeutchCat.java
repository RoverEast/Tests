/**
 * Created by User on 05.12.2016.
 */
public class DeutchCat extends Cat {

    @Override
    public void ID() {
        System.out.println("My ID");
    }

    @Override
    public void age (){
        super.age();
        System.out.println("My age is DeutchCat");
    }

    public void family() {
        System.out.println("Long family tree");
    }
}
