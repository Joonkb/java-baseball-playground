package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("요구사항1")
    void requirement1() {

        String input = "1,2";
        String[] splitArr = input.split(",");

        assertThat(splitArr).contains("1");
        assertThat(splitArr).contains("2");
        assertThat(splitArr).doesNotContain(",");
        assertThat(splitArr).containsExactly("1", "2");
    }

    @Test
    @DisplayName("요구사항2")
    void requirement2() {

        String input = "(1,2)";
        int fndIdx0 = input.indexOf('(');
        int fndIdx1 = input.indexOf(')');
        String removedStr = input.substring(fndIdx0 + 1, fndIdx1);

        assertThat(removedStr).isEqualTo("1,2");
    }

    @Test
    @DisplayName("요구사항3")
    void requirement3() {
        int idx = 25;
        String input = "abc";
        Assertions.assertThatThrownBy(() -> {
            String idxStr = String.valueOf(input.charAt(idx));
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: " + idx);
    }
}