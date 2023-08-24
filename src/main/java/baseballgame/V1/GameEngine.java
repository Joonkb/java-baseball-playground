package baseballgame.V1;

import java.util.Random;

public class GameEngine {

    private final static int randomNumber = 1;
    public GameEngine() {
        // Random 숫자 3자리가 잘 만들어지는지 확인 필요
        Random rand = new Random();
        int num = rand.nextInt(8) + 1;
    }

}
