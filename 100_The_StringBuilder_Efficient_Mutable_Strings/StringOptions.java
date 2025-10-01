public class StringOptions {
    public static void main(String[] args) {
        String helloWorld = "Hello" + "World";
        StringBuilder helloStringBuilder = new StringBuilder("Hello" + "World");
        helloStringBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloStringBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + "World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {
        System.out.println("String = ", string);
        System.out.println("length = ", string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String = ", string);
        System.out.println("length = ", string.length());
        System.out.println("capacity = ", string.capacity());
    }
}
