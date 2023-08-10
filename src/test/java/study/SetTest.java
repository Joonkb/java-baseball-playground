package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("요구사항1")
    void requirement1() {
        Assertions.assertThat(3).isEqualTo(numbers.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void requirement2(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1,true", "5,false", "3,true", "2,true", "6,false"}, delimiterString = ",")
    void requirement3(int input, boolean trueOrFalse) {
        assertThat(numbers.contains(input)).isEqualTo(trueOrFalse);
    }
}