/**
 * Created by User on 18.12.2016.
 */
public class Run {

    public static void main(String[] args) {

        GenericClass<Integer> genericClass1 = new GenericClass<Integer>(228);
        //genericClass1.setName(228);
        System.out.println(genericClass1.getName());

        GenericClass<String> genericClass2 = new GenericClass<String>("Gitter");
        System.out.println(genericClass2.getName());

        GenericClass genericClass3 = new GenericClass();
        //genericClass3 = genericClass1;
        genericClass1.setName(11);
        System.out.println(genericClass3.getName());
    }
}
