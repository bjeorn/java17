package se.bjeorn.demo.java17._switch;

public class SwitchExample {

    // JEP 361: Switch Expressions
    // https://openjdk.org/jeps/361

    public static void main(final String[] args) {
        howMany(1);
        howMany(2);
        howMany(3);
    }

    static void howMany(final int k) {
        switch (k) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            default -> System.out.println("many");
        }

        // Return value
//        System.out.println(
//            switch (k) {
//                case 1 -> "one";
//                case 2 -> "two";
//                default -> "many";
//            }
//        );

//        final var result = switch (k) {
//            case 1 -> "one";
//            case 2 -> "two";
//            default -> "many";
//        };
//        System.out.println(result);

        // Multiline case
//        System.out.println(
//            switch (k) {
//                case 1 -> "one";
//                case 2 -> "two";
//                default -> {
//                    var many = "many";
//                    yield many;
//                }
//            }
//        );


        // Switch with enum error if not all possible values and autocomplete values
//        var testEnum = Test.TEST;
//
//        var result = switch (testEnum) {
//            case TEST -> "testEnum";
//            case TEST2 -> "";
//        };
    }

    public enum Test {
        TEST,
        TEST2,
        TEST3,
        TEST4
    }
}
