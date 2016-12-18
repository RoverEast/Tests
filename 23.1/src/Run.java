/**
 * Created by User on 06.12.2016.
 */
public class Run {
    public static void main(String[] args) {

        String s1 = "soda";
        String s2 = "soda";
        String s3 = new String("soda");

        if(s1.equals(s2)) {

            System.out.println("s1 == s2");
        }
        else {

            System.out.println("s1 != s2");
        }

    }
}
