package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculator {

    private final String fourOperator = "+-*/";


    @ParameterizedTest
    @CsvSource(value = {"12 + 23 - 25,10"}, delimiterString = ",")
    void StringCalculatorTester(String exp, int result) {
        int res = process(exp);
        assertThat(process(exp)).isEqualTo(res);
    }

    private int process(String exp) {

        String[] values = exp.split(" ");

        int num = 0;
        String op = "+";
        for (String what : values) {
            System.out.println(num);
            if(fourOperator.contains(what)) op = what;
            else num = calc(num, Integer.parseInt(what), op);
        }
        return num;
    }

    // 계산식에 맞게 변환 후 반환한다.
    private int calc(int num1, int num2, String what) {
        int res = 0;
        if ("+".equals(what)) {
            res  = num1 + num2;
        } else if ("-".equals(what)) {
            res = num1 - num2;
        } else if ("*".equals(what)) {
            res = num1 * num2;
        } else if ("/".equals(what)) {
            res = num1 / num2;
        }
        return res;
    }
}
