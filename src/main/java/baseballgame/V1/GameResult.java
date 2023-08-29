package baseballgame.V1;

public class GameResult {
    private int ball;
    private int strike;
    GameResult(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
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
