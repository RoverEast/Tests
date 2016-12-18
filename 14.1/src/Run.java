/**
 * Created by User on 04.12.2016.
 */
public class Run {
    public static void main(String[] args) {

        ForGetsAndSets forGetsAndSets = new ForGetsAndSets();

        forGetsAndSets.SetAge(-4);
        forGetsAndSets.SetName("Dima");
        System.out.println(forGetsAndSets.GetAge());
        System.out.println(forGetsAndSets.GetName());
    }
}
