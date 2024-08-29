public class JM96 {
    public static void main(String[] args) {
        String bulletIt = """
                Print a bulleted list:" +
                "• First Point" +
                "   • Sub Point""";

        System.out.println(bulletIt);

        String textBlock = """
                Print a bulleted list:
                    • First Point
                        • Sub Point""";

        System.out.println(textBlock);

        int age = 40;
        System.out.printf("My Age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %.2f, BirthYear = %d%n", (float)age, yearOfBirth);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d, %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
