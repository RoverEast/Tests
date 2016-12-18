/**
 * Created by User on 08.12.2016.
 */
public class Run {
    public static void main(String[] args) {
        int massSize = 3;
        int counter = 0;
        int[][][] mass = new int[massSize][massSize][massSize];

        for(int i = 0; i < massSize; i++){

            for (int j = 0; j < massSize; j++){

                for (int z = 0; z < massSize;z++){
                    mass[i][j][z] = counter;
                    counter++;
                }
            }
        }

        for(int i = 0; i < massSize; i++){

            System.out.println();
            for (int j = 0; j < massSize; j++){

                System.out.println();
                for (int z = 0; z < massSize;z++){
                    System.out.print(" "+mass[z][i][j]+" ");
                }
            }
        }
    }
}
