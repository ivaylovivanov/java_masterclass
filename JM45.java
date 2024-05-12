public class JM45 {
    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

}
