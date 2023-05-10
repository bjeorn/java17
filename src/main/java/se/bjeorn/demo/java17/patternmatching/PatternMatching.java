package se.bjeorn.demo.java17.patternmatching;

public class PatternMatching {

    // JEP 394: Pattern Matching for instanceof
    // https://openjdk.org/jeps/394

    public static void main(final String[] args) {
        match("Hello");
        match(10);
    }

    static void match(final Object obj) {
        if (obj instanceof String s) {
            System.out.println(s + s);
        } else if (obj instanceof Integer i && i > 0) {
            System.out.println(i + i);
        }
    }

    public record Bicycle(String color, String wheelSize) {
    }

    // JEP 406: Pattern Matching for switch (Preview)
    // https://openjdk.org/jeps/406
    // https://openjdk.org/jeps/441 Release 21

//    public static void main(String[] args) {
//        final Object obj = new Bicycle("black", "28");
////        final Object obj = new Bicycle("red", "28");
////        final Object obj = null;
//
//        final var result = switch (obj) {
//            // Guarded pattern
//            case Bicycle b && b.color.equalsIgnoreCase("black") -> "It is a black bicycle!";
//            // Pattern matching
//            case Bicycle b -> "It is a " + b.color + " bicycle!";
//            case null -> "There is no bicycle :(";
//            default -> throw new IllegalStateException("Unexpected value: " + obj);
//        };
//
//        System.out.println(result);
//    }
}
