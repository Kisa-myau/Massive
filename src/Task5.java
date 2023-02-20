import java.util.Arrays;
import java.util.Collections;

public class Task5 {
    public static void fillArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.round((Math.random() * 19) - 9);
        }
    }
    public static int sumCounter (int[]a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = new int[5][]; // инициализация зубчатого массива
        a [0] = new int[3];
        fillArray(a[0]);
        sumCounter(a[0]);

        a [1] = new int[5];
        fillArray(a[1]);
        int s1 = sumCounter(a[1]);

        a [2] = new int[4];
        fillArray(a[2]);
        int s2 = sumCounter(a[2]);

        a [3] = new int[7];
        fillArray(a[3]);
        int s3 = sumCounter(a[3]);

        a [4] = new int[6];
        fillArray(a[4]);
        int s4 = sumCounter(a[4]);

        int [] sumArray = {sumCounter(a[0]),sumCounter(a[1]),sumCounter(a[2]),sumCounter(a[3]),sumCounter(a[4])};

        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < sumArray.length-1; i++) {
                if (sumArray[i] < sumArray[i+1]) {
                    temp = sumArray[i];
                    sumArray[i] = sumArray[i+1];
                    sumArray[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i = 0; i<sumArray.length; i++){
            System.out.println(sumArray [i] + " " + Arrays.toString(a[i]));
        }


        System.out.println("Массив с суммами элементов каждой строки: ");

    }
}
