/**
 * Created by User on 16.12.2016.
 */
public class First {

    public  static int shad = 2;
    public  int dash;

    public int getDash() {
        return dash;
    }

    public void setDash(int dash) {
        this.dash = dash;

    }

    public First(int a, long b){

        System.out.println("int = " +a+ " long = " +b);

    }

    public First(long a, int b){

        System.out.println("long = " +a+ " int = " +b);

    }

    public First() {

        System.out.println("Empty constructor");
    }

    public void dash(){

        System.out.println(dash);
    }

    public void skipper(){
        System.out.println("~~~~~~~~~~~~~~~");
    }

    public static void shad (){

        System.out.println(shad);
    }
}
