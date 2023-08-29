package baseballgame.V1;

import java.util.Random;

public class GameEngine {

    // Test를 위해서 final 삭제,
//    private final String randomNumber;
    private String randomNumber;

    public GameEngine() {
        // TODO: TestCase 작성필요
        int num = 0;
        Random rand = new Random();
        for (int iter = 0; iter < 3; ++iter) {
            int digit = rand.nextInt(9) + 1;
            num *= 10;
            num += digit;
        }
        randomNumber = String.valueOf(num);
    }

    public void setRandomNumberForTest(String testValue) {
        randomNumber = testValue;
    }


    /**
     * 게임의 핵심이 되는 기능
     * 입력받은 숫자와 컴퓨터의 숫자를 비교한다.
     * TODO: 아래의 메서드도 TestCase 작성필요
     * @param inputValue
     * @return GameResult 객체
     */
    public GameResult process(String inputValue) {

        int ball = 0, strike = 0;
        for (int idx = 0; idx < 3; ++idx) {
            char source = randomNumber.charAt(idx);
            char target = inputValue.charAt(idx);
            if(source == target) {
                strike++;
            } else if(randomNumber.contains(target+"")) ball++;
        }
        return new GameResult(ball, strike);
    }

    /**
     * GameEngine 내에 있는 randomNumber 반환한다.
     */
    public String getRandomNumber() {
        return randomNumber;
    }
}
