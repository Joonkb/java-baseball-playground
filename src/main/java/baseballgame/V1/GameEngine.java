package baseballgame.V1;

import java.util.Random;

class GameResult {
    int ball;
    int strike;
}

public class GameEngine {

    private final int randomNumber;
    public GameEngine() {
        // TODO: TestCase 작성필요
        int num = 0;
        Random rand = new Random();
        for (int iter = 1; iter < 3; ++iter) {
            int digit = rand.nextInt(9) + 1;
            num *= 10;
            num += digit;
        }
        randomNumber = num;
    }

    /**
     *
     * 게임의 핵심이 되는 기능
     * 입력받은 숫자와 컴퓨터의 숫자를 비교한다.
     * TODO: 아래의 메서드도 TestCase 작성필요
     * 어떤 형태로 반환할 것인가??
     * @param GameResult 객체를 반환..
     * @return boolean
     */
    public static GameResult process(int inputValue) {
        return null;
    }

    /**
     * GameEngine 내에 있는 randomNumber를 반환한다.
     */
    public int getRandomNumber() {
        return randomNumber;
    }
}
