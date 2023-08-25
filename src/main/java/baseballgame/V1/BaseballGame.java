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
                InputView.getUserInputString();
                userNumber = sc.next();

                GameResult result = engine.process(userNumber);

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

    private static boolean _checkGameIsEnding(GameResult result) {
        if(result.strike == 3) return true;
        return false;
    }

    public static void main(String[] args) {
        gameStart();
    }
}
