package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        double result = max.max(1, 2);
        double expected = 2;
        assertThat(result, closeTo(expected, 0.1));
    }
    @Test
    public void whenMax3To2Then3() {
        Max max = new Max();
        double result = max.max(3, 2);
        double expected = 3;
        assertThat(result, closeTo(expected, 0.1));
    }
    @Test
    public void whenMax2To2Then2() {
        Max max = new Max();
        double result = max.max(2, 2);
        double expected = 2;
        assertThat(result, closeTo(expected, 0.1));
    }
}
