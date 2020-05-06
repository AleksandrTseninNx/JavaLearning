package lesson4;

import java.util.ArrayList;
import java.util.Arrays;

/*Произвести сжатие целочисленного массива.
При сжатии последовательность одинаковых элементов, составляющих серию, заменяется парой чисел,
содержащей сам повторяющийся элемент и количество его повторов.
Произвести обратную распаковку и сравнить результат с помощь метода Arrays.equals.
Пример. Массив {1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5} преобразуется в массив {1, 1, 2, 3, 3, 2, 4, 2, 5, 3}.*/
public class task3 {
    public static void main(String[] args) {
        int n = 10;   //количество элементов массива
        int nUnbox = 14;
        int k =0;
        int count=0;
        int[] array = {1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5};
        int[] arrayTo = new int[n];
        int[] arrayUnbox = new int[nUnbox];
        int[] arrayUnbox1 = new int[nUnbox];
        for (int i = 0; i<array.length-1; i++){
            arrayTo[i] = array[i];
            count=0;
            for (int value : array) {
                if (array[i] == value) {
                    count++;
                }
            }
            arrayTo[i+1] = count;
            i++;
        };
        System.out.println(Arrays.toString(arrayTo));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<arrayTo.length-1;i++) {
            list.add(arrayTo[k]);
                for(int j=1;j<arrayTo[i+1];j++){
                    if(arrayTo[i+1]!=1){
                        list.add(arrayTo[i]);
                    }
                }
                i = i+1;
                k=k+2;
        };
        arrayUnbox = convertIntegers(list);
        System.out.println(list);
        System.out.println(Arrays.equals(array,arrayUnbox));
        }
    public static int[] convertIntegers(ArrayList<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
    }
