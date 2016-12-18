/**
 * Created by User on 04.12.2016.
 */
public class Run {
    public static void main(String[] args) {
        final int massSize = 20;
        final int numberOfstudents = 7;
        int[] mass = new int[massSize];
        Student[] students = new Student[numberOfstudents];
        for(int i = 0; i < massSize; i++){
            mass[i] = i;
        }

      /*  int i = 0;
        while (i <massSize){
            System.out.println(mass[i]);
            i++;
        }*/
      /*  for (int i = massSize-1; i >= 0; i--){
            System.out.println(mass[i]);
        }*/

      for(int i = 0; i < numberOfstudents; i++){
          students[i] = new Student();
          students[i].Age(numberOfstudents-i);
          students[i].Id(i);
          System.out.println("~~~~~~~~~~~~~~~~");
      }

    }
}
