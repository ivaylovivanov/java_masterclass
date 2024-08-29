public class JM98StringMethods {
    public static void main(String[] args) {
        String birthdate = "1990-01-01";
        int startingIndex = birthdate.indexOf("1990");
        System.out.println("starting index: " + startingIndex);
        System.out.println("Birth year = " + birthdate.substring(startingIndex));

        System.out.println("Month = " + birthdate.substring(5,7));

        String newDate = String.join("/", "11", "11", "1984");
        System.out.println(newDate);

        newDate = "11";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1984");
        System.out.println(newDate);

        newDate = "11" + "/" + "11" + "/" + "1984";
        System.out.println(newDate);

        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("11", "12"));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("11", "12"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("     ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
