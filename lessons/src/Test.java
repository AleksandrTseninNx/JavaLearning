public class Test {

    public static void main(String[] args) {

        Person kate = new Person("Kate", 32, true);
        kate.displayInfo();
    }
}

class Person {

    String name;
    int age;
    boolean hasCat;

    Person(String name, int age, boolean hasCat) {
        this.name = name;
        this.age = age;
        this.hasCat = hasCat;
    }

    void displayInfo() {
        System.out.printf("Name: %s \t Age: %d HasCat: %b ", name, age, hasCat);
    }
}
// javac study\Program.java
// java study.Program