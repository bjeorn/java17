package se.bjeorn.demo.java17.record;

public class RecordExample {

    // JEP 395: Records
    // https://openjdk.org/jeps/395

    // * No extends clause
    // * A record class is implicitly final, and cannot be abstract
    // * All fields are final
    // * No explicitly declared instance fields

    // * A record class can be declared top level or nested, and can be generic.
    // * A record class can declare static methods, fields, and initializers.
    // * A record class can declare instance methods.
    // * A record class can implement interfaces.
    // * Instances of record classes can be serialized and deserialized.

    record Example(String example) {
    }

    public static void main(String[] args) {
        var car = new Car("red", 5);
//        var car = new Car("blue", 5);

        System.out.println(car);
    }

    record Car(String color, int passengerSeats) {

        Car {
            if (color.equals("red")) {
                System.out.println("It is a red car!");
            } else {
                throw new IllegalArgumentException("CAR MUST BE RED!! >:(");
            }
        }
    }
}
