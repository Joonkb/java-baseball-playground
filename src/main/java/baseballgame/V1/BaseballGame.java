package baseballgame.V1;

import java.util.Scanner;

public class BaseballGame {

    private static String userNumber;
    private static Scanner sc = new Scanner(System.in);

    private static void gameStart() {

        while(true) {
            // 게임시작
            GameEngine engine = new GameEngine();

            while (true) {
                GameResult result = processUserStep(engine);

                // 게임결과 출력
                ResultView.getGameResultString(result);

                // Game 종료여부 check
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
     * 사용자로부터 숫자를 입력받아 GameResult를 반환한다.
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
