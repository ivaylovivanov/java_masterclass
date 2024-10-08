public class JM99StringBuilder {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        helloWorld.concat(" and Goodbye");

        StringBuilder hellowWorldBuilder = new StringBuilder("Hello" + " World");
        hellowWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(hellowWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(2).insert(2, "l");
        System.out.println(builderPlus);
        builderPlus.replace(10, 10, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string){
        System.out.println("String: " + string);
        System.out.println("length: " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder: " + builder);
        System.out.println("length: " + builder.length());
        System.out.println("capacity: " + builder.capacity());
    }
}
