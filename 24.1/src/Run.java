import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by User on 06.12.2016.
 */
public class Run {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        Scanner sc = new Scanner(System.in);

        System.out.println("Input first type");
        //String forFirst = br.readLine();
        //System.out.println("First string: " + forFirst);
        System.out.println("First string: " + br.readLine());

        System.out.println("Input second type");
        //String forSecond = sc.next();
        //System.out.println("Second string: " + forSecond);
        System.out.println("Second string: " + sc.next());



    }
}
