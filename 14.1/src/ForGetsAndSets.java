/**
 * Created by User on 04.12.2016.
 */
public class ForGetsAndSets {
    public static final int DEFAULT_AGE = 18;
    private int age ;
    private String name;

    public ForGetsAndSets(){
        this(DEFAULT_AGE);
    }

    public ForGetsAndSets(int age){
        System.out.println("Constructor's age = " + age);
    }

    public int GetAge() {
        return age;
    }

    public String GetName() {
        return name;
    }

    public void SetName(String name){
        if (name == null) {
            System.out.println("Name printed incorrect");
        } else
           this.name = name;

    }

    public void SetAge (int age){
        if (age < 0) {
            System.out.println("Age printed incorrect");
        } else {
            this.age = age;
        }
    }

}
