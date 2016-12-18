/**
 * Created by User on 07.12.2016.
 */
public class Mass {

    public final int MASS_SIZE = 10;
    public final char MASS_VALUE_STAR = '*';
    public final char MASS_VALUE_SPACE = ' ' ;
    char[][] mass = new char[MASS_SIZE][MASS_SIZE];

    public void setValueToCell() {

        for(int i = 0; i < MASS_SIZE; i++){
            setLineValue(i);
        }
    }
    private void setLineValue(int lineNumber){
        for(int i = 0; i < MASS_SIZE; i++){
            if(i<=lineNumber) {
                mass[i][lineNumber] = MASS_VALUE_STAR;
            }else {
                mass[i][lineNumber] = MASS_VALUE_SPACE;
            }
        }
    }



    public void printMass(){
        for(int i = 0; i < MASS_SIZE; i++){
            printLine(i);
        }
    }

    private void printLine(int lineNumber){
        for (int i = 0; i < MASS_SIZE; i++){
            System.out.print(mass[i][lineNumber]);
        }
        System.out.println();
    }

}
