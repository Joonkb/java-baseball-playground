package baseballgame.V1;

import java.util.Random;

public class GameEngine {
    
    private String randomNumber = "";

    public GameEngine() {
        Random rand = new Random();
        while (randomNumber.length() < 3) {
            String num = String.valueOf(rand.nextInt(9) + 1);
            // �����丵 �ʿ� : depth 1
            if(!randomNumber.contains(num)) {
                randomNumber += num;
            }
        }
    }

    public void setRandomNumberForTest(String testValue) {
        randomNumber = testValue;
    }

    /**
     * ������ �ٽ��� �Ǵ� ���
     * �Է¹��� ���ڿ� ��ǻ���� ���ڸ� ���Ѵ�.
     * @param inputValue
     * @return GameResult ��ü
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
     * GameEngine ���� �ִ� randomNumber ��ȯ�Ѵ�.
     */
    public String getRandomNumber() {
        return randomNumber;
    }
}