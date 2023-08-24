package baseballgame.V1;

import java.util.Scanner;

public class BaseballGame {

    private static int userNumber;
    private static Scanner sc = new Scanner(System.in);

    private static void gameStart() {
        while (true) {

            // GameEngine START
            GameEngine engine = new GameEngine();

            InputView.getUserInputString();
            userNumber = sc.nextInt();

            GameResult result = engine.process(userNumber);
            
            // 게임결과 출력
            ResultView.getGameResultString(result);
            
            // Game 종료여부
        }
    }

    public static void main(String[] args) {
        gameStart();
    }
}
