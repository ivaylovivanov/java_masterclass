public class JM48 {
    public static void main(String[] args) {
        displayHighScorePosition("Ivo", calculateHighScorePosition(1500));
        displayHighScorePosition("Ivo", calculateHighScorePosition(1000));
        displayHighScorePosition("Ivo", calculateHighScorePosition(500));
        displayHighScorePosition("Ivo", calculateHighScorePosition(100));
        displayHighScorePosition("Ivo", calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String playerName, int positionInList){

        System.out.println(playerName + " managed to get to position " + positionInList + " in the high score list.");

    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;

        if (playerScore >= 1_000){
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

}
