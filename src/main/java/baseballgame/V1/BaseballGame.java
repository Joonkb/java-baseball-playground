package baseballgame.V1;

import java.util.Scanner;

public class BaseballGame {

    private static String userNumber;
    private static Scanner sc = new Scanner(System.in);

    private static void gameStart() {
        do {
            gamePlaying();
        } while(validateNextGame());
    }

    private static void gamePlaying() {
        boolean gameStopYn = true;
        GameEngine engine = new GameEngine();
        while (gameStopYn) {
            GameResult result = processUserStep(engine);

            // ���Ӱ�� ���
            ResultView.getGameResultString(result);

            // Game ���Ῡ�� check
            gameStopYn = isThreeStrikeOut(result);
        }
    }

    private static boolean validateNextGame() {
        int userGameEndYn = sc.nextInt();
        if (userGameEndYn == 2) return false;
        return true;
    }

    /**
     * ����ڷκ��� ���ڸ� �Է¹޾� GameResult�� ��ȯ�Ѵ�.
     */
    private static GameResult processUserStep(GameEngine engine) {
        InputView.getUserInputString();
        userNumber = sc.next();
        GameResult result = engine.process(userNumber);
        return result;
    }

    private static boolean isThreeStrikeOut(GameResult result) {
        if(result.getStrike() == 3) return true;
        return false;
    }

    public static void main(String[] args) {
        gameStart();
    }
}
