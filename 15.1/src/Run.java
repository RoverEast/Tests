/**
 * Created by User on 04.12.2016.
 */
public class Run {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.OverL();
        overload.OverL(1,2,(byte)3);
        overload.OverL(1,(byte)2,3);
    }
}
