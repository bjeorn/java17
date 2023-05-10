package se.bjeorn.demo.java17.nullpointer;

public class NullPointerExample {

    // JEP 358: Helpful NullPointerExceptions
    // https://openjdk.org/jeps/358

    public static void main(final String[] args) {
        final var car = new Car("Eleanor", null);

        System.out.println(car.color().name());

        // Exception in thread "main" java.lang.NullPointerException:
        // Cannot invoke "se.bjeorn.demo.java17.nullpointer.NullPointerExample$Color.name()"
        // because the return value of "se.bjeorn.demo.java17.nullpointer.NullPointerExample$Car.color()" is null at
        // se.bjeorn.demo.java17.nullpointer.NullPointerExample.main(NullPointerExample.java:11)
    }

    record Car(String name, Color color) {

    }

    record Color(String name) {

    }
}
