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

            // 게임결과 출력
            ResultView.getGameResultString(result);

            // Game 종료여부 check
            gameStopYn = isThreeStrikeOut(result);
        }
    }

    private static boolean validateNextGame() {
        int userGameEndYn = sc.nextInt();
        if (userGameEndYn == 2) return false;
        return true;
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

    private static boolean isThreeStrikeOut(GameResult result) {
        if(result.getStrike() == 3) return true;
        return false;
    }

    public static void main(String[] args) {
        gameStart();
    }
}
