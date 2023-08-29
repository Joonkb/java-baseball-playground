package baseballgame.V1;

import java.util.Random;

public class GameEngine {
    
    private String randomNumber = "";

    public GameEngine() {
        Random rand = new Random();
        while (randomNumber.length() < 3) {
            String num = String.valueOf(rand.nextInt(9) + 1);
            // 리팩토링 필요 : depth 1
            if(!randomNumber.contains(num)) {
                randomNumber += num;
            }
        }
    }

    public void setRandomNumberForTest(String testValue) {
        randomNumber = testValue;
    }

    /**
     * 게임의 핵심이 되는 기능
     * 입력받은 숫자와 컴퓨터의 숫자를 비교한다.
     * @param inputValue
     * @return GameResult 객체
     */
    public GameResult process(String inputValue) {
        int ball = 0, strike = 0;
        GameResult result = new GameResult();
        for (int idx = 0; idx < 3; ++idx) {
            char source = randomNumber.charAt(idx);
            char target = inputValue.charAt(idx);
            calcResult(source, target, result);
        }
        return new GameResult(ball, strike);
    }

    private void calcResult(char source, char target, GameResult result) {
        if(source == target) {
           result.incrementStrikeCount();
           return;
        }
        if(randomNumber.contains(target+"")) result.incrementBallCount();
    }

    /**
     * GameEngine 내에 있는 randomNumber 반환한다.
     */
    public String getRandomNumber() {
        return randomNumber;
    }
}