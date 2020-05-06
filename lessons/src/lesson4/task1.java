package lesson4;
/*
Проверить производительность методов копирования массивов. Найти среднее время (ms) выполнения методов Arrays.copyOf, clone() и алгоритма традиционно копирования элементов.  Для замера времени использовать метод System.nanoTime().
 */
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int n = 10000000;   //количество элементов массива
        double avgTime;
        int[] array = new int[n];
        long startTime =System.nanoTime();
        for (int i = 0, s = 0; i < n; i++) {
            array[i] += i;
        }
        long endTime =System.nanoTime();
        System.out.println("Заполнение в мс:"+(endTime-startTime)/ 1000000);

        startTime = System.nanoTime();
        int[] arrayCopy1 = Arrays.copyOf(array,n);
        endTime =System.nanoTime();
        System.out.println("Arrays.copyOf в мс:"+(endTime-startTime)/ 1000000);

        startTime = System.nanoTime();
        int[] arrayCopy2 = array.clone();
        endTime =System.nanoTime();
        System.out.println("clone в мс:"+(endTime-startTime)/ 1000000);

        int[] arrayCopy3 = new int[10000000];
        startTime = System.nanoTime();
        System.arraycopy(array,0,arrayCopy3,0,n);
        endTime =System.nanoTime();
        System.out.println(arrayCopy3.length);
        System.out.println("Traditional в мс:"+(endTime-startTime)/ 1000000);
    }
}
