package lesson8;

enum VehicleTypes{NONE,CAR,CROSSOVER,MOTOR_BIKE,SUV,TRUCK,OTHER};

final class Person {
    final String surname;
    final String name;
    public static final lesson8.Person invisibleMan = new lesson8.Person("","");
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

    public Person(final String surname, final String name) {
        this.surname = surname;
        this.name = name;
    }

}

final class Vehicle {
    public static final lesson8.Vehicle invisibleCar = new lesson8.Vehicle("","","",VehicleTypes.NONE);
    final String gosnomer;
    final String proizvoditel;
    final String model;
    final VehicleTypes type;

    public Vehicle() {
        this.gosnomer = "";
        this.proizvoditel = "";
        this.model = "";
        this.type = VehicleTypes.NONE;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "gosnomer='" + gosnomer + "proizvoditel=" +proizvoditel+
                "model=" +model+"type=" +type+
                '}';
    }

    public Vehicle(final String gosnomer, final String proizvoditel, final String model,final VehicleTypes type) {
        this.gosnomer = gosnomer;
        this.proizvoditel = proizvoditel;
        this.model = model;
        this.type = type;
    }

    public String getGosnomer() {
        return gosnomer;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public String getModel() {
        return model;
    }


}

interface Space{
    void setSpace();
}

class AbstractSpace implements Space {
    lesson8.Person man;
    lesson8.Vehicle car;
    private boolean Empty;
    @Override
    public void setSpace() {
        this.man = lesson8.Person.invisibleMan;
        this.car = Vehicle.invisibleCar;
    }
    public void setSpaceWithCar(Vehicle car) {
        this.man = lesson8.Person.invisibleMan;
        this.car = car;
    }
    public void setSpaceWithCarMan(Person man, Vehicle car) {
        this.man = man;
        this.car = car;
    }
    public boolean getEmptySpace(Object o){
        if (this.car == null ||
                this.man == null||
                this.car == lesson8.Vehicle.invisibleCar && this.man == lesson8.Person.invisibleMan) {Empty = true;} else {Empty = false;}
    return Empty;
    }
}

public class task2 {
    public static void main(String[] args) {
        lesson8.Person man = new lesson8.Person("Testovitch","Test");
        System.out.println(man.getName());
        System.out.println(man.getSurname());
        System.out.println(man.toString());

        lesson8.Vehicle car = new lesson8.Vehicle();
        System.out.println("Default car "+car.toString());
        lesson8.Vehicle car2 = new lesson8.Vehicle("154","MekShop","BoomMegaBlasta",VehicleTypes.MOTOR_BIKE);
        System.out.println(car2.getGosnomer());
        System.out.println(car2.getProizvoditel());
        System.out.println(car2.getModel());

        AbstractSpace mesto = new AbstractSpace();
        mesto.setSpace();
        System.out.println(mesto.car);
        System.out.println(mesto.getEmptySpace(mesto));
        mesto.setSpaceWithCar(new lesson8.Vehicle("154","MekShop","BoomMegaBlasta",VehicleTypes.MOTOR_BIKE));
        System.out.println(mesto.car);
        System.out.println(mesto.getEmptySpace(mesto));
        mesto.setSpaceWithCarMan(new lesson8.Person("Testovitch","Test"),
                new lesson8.Vehicle("154","MekShop","BoomMegaBlasta",VehicleTypes.MOTOR_BIKE));
        System.out.println(mesto.man);
        System.out.println(mesto.car);
        System.out.println(mesto.getEmptySpace(mesto));
    }
}
