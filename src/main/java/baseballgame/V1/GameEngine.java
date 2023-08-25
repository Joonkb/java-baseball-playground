package baseballgame.V1;

import java.util.Random;

public class GameEngine {

    private final String randomNumber;
    public GameEngine() {
        // TODO: TestCase �ۼ��ʿ�
        int num = 0;
        Random rand = new Random();
        for (int iter = 0; iter < 3; ++iter) {
            int digit = rand.nextInt(9) + 1;
            num *= 10;
            num += digit;
        }
        randomNumber = String.valueOf(num);
        System.out.println(randomNumber);
    }

    /**
     * ������ �ٽ��� �Ǵ� ���
     * �Է¹��� ���ڿ� ��ǻ���� ���ڸ� ���Ѵ�.
     * TODO: �Ʒ��� �޼��嵵 TestCase �ۼ��ʿ�
     * � ���·� ��ȯ�� ���ΰ�??
     * @param
     * @return GameResult ��ü
     */
    public GameResult process(String inputValue) {

        int ball = 0, strike = 0;
        for (int idx = 0; idx < 3; ++idx) {
            char source = randomNumber.charAt(idx);
            char target = inputValue.charAt(idx);
            if(source ==  target) {
                strike++;
            }  else if(randomNumber.contains(target+"")) ball++;
        }
        return new GameResult(ball, strike);
    }

    /**
     * GameEngine ���� �ִ� randomNumber�� ��ȯ�Ѵ�.
     */
    public String getRandomNumber() {
        return randomNumber;
    }
}
