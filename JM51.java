public class JM51 {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player: " + playerName + " Score: " + score + " points");

        return score * 1000;
    }

    public static int calculateScore(int score){
        return calculateScore("Anonymous", score);
    }
}
