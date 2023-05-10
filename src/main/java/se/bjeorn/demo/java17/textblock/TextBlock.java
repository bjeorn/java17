package se.bjeorn.demo.java17.textblock;

public class TextBlock {

    // JEP 378: Text Blocks
    // https://openjdk.org/jeps/378

    public static void main(final String[] args) {
        final var text = """
            {
                "name": "Peter Parker",
                "hometown": "New York"
            }
            """;
        System.out.println(text);
    }
}
