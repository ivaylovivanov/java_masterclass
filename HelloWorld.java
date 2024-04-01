public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("It is not an alien.");
            System.out.println("And I am afraid of aliens.");
        }

        int topScore = 100;
        if(topScore <= 100){
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore <= 100){
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90){
            System.out.println("Either, or both of the conditions are true.");
        }

    }
}
