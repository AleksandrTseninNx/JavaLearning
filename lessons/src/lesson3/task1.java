package lesson3;

public class task1 {
    public static void main(String[] args) {
        byte  a = 12;
        byte  a1 = -128;
        //String convert = Integer.toBinaryString(bitImage);
       // System.out.println(convert);

        System.out.print("right-shift (a >>> 2): ");
        showBits(a1);

        //System.out.println(Integer.toBinaryString(bitImage2));
       // System.out.println(String.format("%8s", Integer.toBinaryString(0xFF & bitImage)).replaceAll(" ", "0"));
    }
    public static void showBits(int param) {
        int mask = 1 << 7;

        for (int i = 1; i <= 8; i++, param <<= 1) {
            System.out.print((param & mask) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
