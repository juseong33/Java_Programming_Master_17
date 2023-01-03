package FirstMethodChallenge;

public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Juseong1", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Juseong2", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Juseong3", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Juseong4", highScorePosition);

        highScorePosition = calculateHighScorePosition(-1000);
        displayHighScorePosition("Juseong5", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
