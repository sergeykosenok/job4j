package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        double result = check.max(1, 4, 2);
        double expected = 4;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        double result = check.max(5, 4, 2);
        double expected = 5;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        double result = check.max(5, 4, 7);
        double expected = 7;
        assertThat(result, closeTo(expected, 0.1));
    }
}