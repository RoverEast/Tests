/**
 * Created by User on 16.12.2016.
 */
public class Second extends First{

    public static final int MASS_SIZE = 10;
    private int[] mas1 = new int[MASS_SIZE];
    private int[][] mas2 = new int[MASS_SIZE][MASS_SIZE];

    public void PrintMas1(){

        for(int i = 0; i < mas1.length; i++){

            System.out.println(mas1[i]);
        }
    }

    @Override
    public void dash() {

        //super.dash();
        System.out.println("Override method dash");

    }

    public void PrintMas2(){

        for(int  i = 0; i < MASS_SIZE; i++){
            PrintLineMas2(i);
            System.out.println();
        }
    }

    private void PrintLineMas2(int lineNumber){

        for(int  i = 0; i < MASS_SIZE; i++){

            System.out.print(mas2[i][lineNumber]);
        }
    }



}
