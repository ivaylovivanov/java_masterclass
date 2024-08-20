import java.util.Scanner;

public class JM70 {
    public static void main(String[] args) {
        int currentYear = 2024;
        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch(NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, what is your name?");
        System.out.println("Hi " + name + ", thanks for taking the course?");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = Integer.parseInt(dateOfBirth);

        return "So you are " + (currentYear - age) + " years old.";
    }

    public static String getInputFromScanner(int currentYear){

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Hi, what is your name?");
        String name = newScanner.nextLine();

        System.out.println("Hi " + name + ", thanks for taking the course?");

        //String dateOfBirth = System.console().readLine("What year were you born?");
        System.out.println("What year were you born?");

        boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter an year of birth >= " +
                    (currentYear - 125) + " and <= " + currentYear + " years old.");
            try {
                age = checkDate(currentYear, newScanner.nextLine());
                validDOB = age >= 0;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed!!! Please try again.");
            }
        } while (!validDOB);


        return "So you are " + age + " years old.";
    }

    public static int checkDate(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimalYear = currentYear - 125;
        if(dob < minimalYear || dob > currentYear){
            return -1;
        }

        return (currentYear - dob);
    }
}
