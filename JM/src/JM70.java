public class JM70 {
    public static void main(String[] args) {
        int currentYear = 2024;

        System.out.println(getInputFromConsole(currentYear));

        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, what is your name?");
        System.out.println("Hi " + name + ", thanks for taking the course?");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = Integer.parseInt(dateOfBirth);

        return "So you are " + (currentYear - age) + " years old.";
    }

    public static String getInputFromScanner(int currentYear){



        return "";
    }
}
