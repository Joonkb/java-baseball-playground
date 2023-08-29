package baseballgame.V1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GameEngineTest {

    private GameEngine engine;

    @BeforeEach
    void setUp() {
        engine = new GameEngine();
    }

    @ParameterizedTest
    @CsvSource(value = {"333,333,0,3", "342,345,0,2", "123,321,2,1"}, delimiter = ',')
    @DisplayName("입력받은 숫자와 컴퓨터의 수를 비교하여 ball 수, strike 수를 반환하여 값을 비교한다.")
    void gameEngineProcessTest(String inputValue1, String inputValue2, int ball, int strike) {
        // Test를 위한 임시 메서드 작성.
        engine.setRandomNumberForTest(inputValue1);

        GameResult result = process(inputValue2);
        Assertions.assertEquals(ball,   result.getBall());
        Assertions.assertEquals(strike, result.getStrike());
    }

    private GameResult process(String inputValue) {
        return engine.process(inputValue);
    }

    @Test
    @DisplayName("랜덤한 숫자 테스트")
    void randomNumberTest() {
        Random rand = new Random();
        for(int i = 0; i < 30; i++){
            int digit = rand.nextInt(9) + 1;
            System.out.print(digit + " ");
        }
    }
}