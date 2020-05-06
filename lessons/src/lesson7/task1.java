package lesson7;

class Person {
    String surname;
    String name;
    public static final Person invisibleMan = new Person("","");
    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + name + "  " +surname+
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

}

class Vehicle {
    public static final Vehicle invisibleCar = new Vehicle("","","");
    String gosnomer;
    String proizvoditel;
    String model;

    public Vehicle() {
        this.gosnomer = "";
        this.proizvoditel = "";
        this.model = "";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "gosnomer='" + gosnomer + "proizvoditel=" +proizvoditel+
                "model=" +model+
                '}';
    }

    public Vehicle(String gosnomer, String proizvoditel, String model) {
        this.gosnomer = gosnomer;
        this.proizvoditel = proizvoditel;
        this.model = model;
    }

    public String getGosnomer() {
        return gosnomer;
    }
    public void setGosnomer(String gosnomer) {
        this.gosnomer = gosnomer;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }
    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }


}

class Space{
    Person man;
    Vehicle car;

    public Space(){
        this.man = Person.invisibleMan;
        this.car = new Vehicle();
    }

    public Space(Person man, Vehicle car){
        this.man = man;
        this.car = car;
    }

    public Person getMan() {
        return man;
    }

    public void setMan(Person man) {
        this.man = man;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }
    public boolean checkSpace(Object o){
        if (this.car == null || this.man == null||this.car == Vehicle.invisibleCar && this.man == Person.invisibleMan) {return true;} else {return false;}
    }
}
public class task1 {
    public static void main(String[] args) {
        Person man = Person.invisibleMan;
        System.out.println(man.getName());
        System.out.println(man.getSurname());
        Person man2 = new Person("Sniper","Lens");
        System.out.println(man2.getName());
        System.out.println(man2.getSurname());
        System.out.println(man2.toString());
        Person man3 = new Person("Testovitch","Test");
        System.out.println(man3.getName());
        System.out.println(man3.getSurname());
        System.out.println(man3.toString());

        Vehicle car = new Vehicle();
        System.out.println("Default car "+car.toString());
        Vehicle car2 = new Vehicle("154","MekShop","BoomMegaBlasta");
        System.out.println(car2.getGosnomer());
        System.out.println(car2.getProizvoditel());
        System.out.println(car2.getModel());
        car2.setGosnomer("155");
        System.out.println(car2.getGosnomer());
        System.out.println(car2.getProizvoditel());
        System.out.println(car2.getModel());

        Space mesto = new Space(new Person("Sniper","Lens"),
                new Vehicle("154","MekShop","BoomMegaBlasta"));
        System.out.println(mesto.getCar());
        System.out.println(mesto.getMan());
        mesto.setMan(new Person("Ivan","Ivan"));
        mesto.setCar(new Vehicle("153","BigMekShop","BoomMegaBlasta"));
        System.out.println(mesto.getCar());
        System.out.println(mesto.getMan());

        Space mesto2 = new Space(Person.invisibleMan, Vehicle.invisibleCar);
        System.out.println(mesto2.checkSpace(mesto2));
        System.out.println(mesto.checkSpace(mesto));


    }
}
