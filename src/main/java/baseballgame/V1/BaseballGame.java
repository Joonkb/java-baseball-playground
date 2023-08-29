package baseballgame.V1;

import java.util.Scanner;

public class BaseballGame {

    private static String userNumber;
    private static Scanner sc = new Scanner(System.in);

    private static void gameStart() {

        while(true) {
            // ���ӽ���
            GameEngine engine = new GameEngine();

            while (true) {
                GameResult result = processUserStep(engine);

                // ���Ӱ�� ���
                ResultView.getGameResultString(result);

                // Game ���Ῡ�� check
                if (_checkGameIsEnding(result)) {
                    ResultView.getGameEndString();
                    break;
                }
            }
            int gameEndYn = sc.nextInt();
            if(gameEndYn == 2) break;
        }
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

    private static boolean _checkGameIsEnding(GameResult result) {
        if(result.strike == 3) return true;
        return false;
    }

    public static void main(String[] args) {
        gameStart();
    }
}
