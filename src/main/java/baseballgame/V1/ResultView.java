package baseballgame.V1;

public class ResultView {
    public static void getGameResultString(GameResult result) {
        int ball = result.ball;
        int strike = result.strike;

        String resultStr = "";
        if(ball != 0) resultStr +=  (ball + "�� ");
        if(strike != 0) resultStr += (strike + "��Ʈ����ũ");
        System.out.println(resultStr);
    }
    public static void getGameEndString() {
        System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
        System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
    }
}
