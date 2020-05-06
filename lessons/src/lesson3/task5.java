package lesson3;

public class task5 {
    public static void main(String[] args) {
        int n = 64;
        boolean deg2 = (n != 0) && (n & (n-1)) == 0;
        System.out.println(deg2);
        int n2 = 63;
        boolean deg3 = (n2 != 0) && (n2 & (n2-1)) == 0;
        System.out.println(deg3);
    }
}
