/**
 * Created by User on 04.12.2016.
 */
public class Overload {
    void OverL(){
        System.out.println("Without Overload");
    }
    void OverL(int a, byte b, long c){
        System.out.println("int a, byte b, long c");
    }
    void OverL(int a, long c, byte b){
        System.out.println("int a, long c, byte b");
    }

}
