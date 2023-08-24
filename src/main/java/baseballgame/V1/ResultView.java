package baseballgame.V1;

public class ResultView {
    public static String getGameResultString(int ball, int strike) {
        String resultStr = "";
        if(ball != 0) resultStr +=  (ball + "볼 ");
        if(strike != 0) resultStr = (strike + "스트라이크");

        return resultStr;
    }
}
