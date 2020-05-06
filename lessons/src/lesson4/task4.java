package lesson4;
/*
Произвести слияние двух упорядоченных массивов типа long, и получить новый упорядоченный массив.
*/
import java.util.Arrays;

public class task4 {
    public static void main(String[] args){
        int[] array = {4, 8, 12, 14, 23, 85};
        int[] array2 = {2, 4, 8, 9, 12, 16};
        int[] array3 = new int[12];
       // array3=Arrays.copyOf(array,12);
        //array3= Arrays.copyOf(array2,12);
        System.arraycopy(array, 0, array3, 0, 6);
        System.arraycopy(array2, 0, array3, 6, 6);
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));    //prints the resultant array
        };
    }
