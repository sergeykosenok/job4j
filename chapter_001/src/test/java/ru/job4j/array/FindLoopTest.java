package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas10Then1() {
        FindLoop find = new FindLoop();
        double[] input = new double[] {5, 10, 3};
        double value = 10;
        int result = find.getIndex(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7ThenMinus1() {
        FindLoop find = new FindLoop();
        double[] input = new double[] {5, 10, 3};
        double value = 7;
        int result = find.getIndex(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
