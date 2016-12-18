/**
 * Created by User on 18.12.2016.
 */
public class GenericClass <T> {

    private T name;

    public GenericClass() {
    }

    public GenericClass(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public String toString(){

        if(name == null){
            return  null;
        }
        return name.getClass().getName() + ":" + name;


    }
}
