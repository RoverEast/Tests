import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 16.12.2016.
 */
public class Run {

    public static void main(String[] args) throws IOException {

        First first = new First((long)5, 3);
        Second second = new Second();
        First polymorphFirst = new Second();
        Third third = new Third();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        Thread thread1 = new Thread(third);

        String s;
        int k;

        first.skipper();
        System.out.println(first.dash);
        first.dash();
        first.skipper();
        System.out.println(First.shad);
        First.shad();
        first.skipper();
        second.dash();
        Second.shad();
        first.skipper();
        polymorphFirst.dash();
        first.skipper();
        second.PrintMas1();
        first.skipper();
        second.PrintMas2();
        first.skipper();
        third.AC();
        third.NotAC();
        third.interf();
        first.skipper();
        first.setDash(4);
        System.out.println(first.getDash());
        first.skipper();
        /*s = reader.readLine();
        System.out.println(s);
        k = scanner.nextInt();
        System.out.println(k);
        first.skipper();*/
        third.Compare();
        first.skipper();

    }
}
