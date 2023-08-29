package baseballgame.V1;

public class GameResult {
    int ball;
    int strike;
    GameResult(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }
    public GameResult() {

    }
    public void incrementBallCount() {
        ball += 1;
    }
    public void incrementStrikeCount() {
        strike += 1;
    }
}
