public class JM45 {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;

        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("the next high score is " +
            calculateScore(gameOver, score, levelCompleted, bonus)
        );
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

}
