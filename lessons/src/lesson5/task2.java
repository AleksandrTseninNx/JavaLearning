package lesson5;
/*
Определить правильность формата для СНИЛС с помощью RegExp.
    //^\d{3}-\d{3}-\d{3}-\d{2}$
 */
public class task2 {
    public static void main(String[] args) {
        String str = "123-456-789-01";
        String strbad = "123-456-789-01123";
        System.out.println("СНИЛС 123-456-789-01 "+SnilsCheker(str));
        System.out.println("СНИЛС 123-456-789-01123 "+SnilsCheker(strbad));
    }

    public static boolean SnilsCheker(String snils) {
        return snils.matches("^\\d{3}-\\d{3}-\\d{3}-\\d{2}$");

    }
}