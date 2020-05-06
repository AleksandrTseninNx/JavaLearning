package lesson4;
/*
Задан массив, который хранит набор идентификаторов типа long из таблицы заключенных договоров дилеров по стране. Значение идентификатора имеет следующую структуру:
 [XXXX] [YY] [ZZZ] [WW]
XXXX – уникальный номер дилера;
YY – номер региона дилера;
ZZZ – количество заключенных договоров;
WW – статус плана заключения договоров.
Пример.
Идентификатор: 8508 04 731 04 (8508 – номер дилера, 04 – регион, 731 – количество договоров, 04 – статус)
Сделать сводную таблицу по регионам с суммарным количеством договоров. Результат сохранить в двумерный массив и упорядочить по номеру региону.
 */
import java.util.Arrays;
import java.util.Comparator;

public class task5 {
    public static void main(String[] args){
        long[] dogovori = { 85080473104L, 20470810710L, 67380581309L, 53001582606L, 48201702305L, 21610343308L, 87310652801L,
                97801961912L, 54171573511L, 39561410912L, 11941311809L, 44677392502L, 42528377612L, 58879103612L,
                55758121301L, 28197032810L, 99807815107L, 56538719602L, 89498500712L, 24868203501L, 71238933112L,
                61557888212L};
        boolean flag = false;
        long dgvcount =0;
        long flagDlr = 0;
        int s =0;
        long[][] svod = new long[22][2];
        long[][] svodagr = new long[21][2];
        long[][] svodAgrClean = new long[20][2];

        for (int i = 0; i < svod.length; i++) {
            for (int j = 0; j < svod[i].length; j++) {
                String str = Long.toString(dogovori[i]);
                String dlr_num = str.substring(4, 6);
                String dgvrcount = str.substring(6,9);
                svod[i][0]= Long.valueOf(dlr_num);
                svod[i][1] = Long.valueOf(dgvrcount);
            }
        }
       for(int k=0;k<svod.length;k++){
           if(svod[k][0]!=flagDlr){
           svodagr[k][0] = svod[k][0];
           dgvcount=svod[k][1];
           svodagr[k][1] = dgvcount;
           }
           for(int m=k+1;m<svod.length;m++){
               if(svod[k][0]==svod[m][0]){
                   flagDlr = svodagr[k][0];
                    svodagr[k][1]=dgvcount+svod[m][1];
               }
               }

           };
       Arrays.sort(svodagr, Comparator.comparingLong(arr -> arr[0]));

for(int c=1;c<svodagr.length;c++){
    svodAgrClean[c-1][0] = svodagr[c][0];
    svodAgrClean[c-1][1] = svodagr[c][1];

};
        for (long[] anArr : svodAgrClean) {
            for (long anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
       // System.out.println(Arrays.deepToString(svodAgrClean));
    }
}
