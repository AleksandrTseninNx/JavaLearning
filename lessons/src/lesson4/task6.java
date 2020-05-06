package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Для n >=0, создать массив по следующему шаблону {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}.*/
public class task6 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listout = new ArrayList<>();
        int n =0;
        System.out.print("Enter Integer:");
        try {
            n = Integer.parseInt(br.readLine());
        } catch(NumberFormatException | IOException nfe) {
            System.err.println("Invalid Format!");
        }
        for (int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                listout.add(j+1);
            }
        };
        System.out.println(listout.toString());
    }
}
