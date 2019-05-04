package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenStart1Finish11CountSumThen30() {
        Counter counter = new Counter();
        int result = counter.add(1, 11);
        int expected = 30;
        assertThat(result, is(expected));
    }

    @Test
    public void whenStart2Finish10CountSumThen30() {
        Counter counter = new Counter();
        int result = counter.add(2, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }

    @Test
    public void whenStart3Finish11CountSumThen22() {
        Counter counter = new Counter();
        int result = counter.add(3, 11);
        int expected = 28;
        assertThat(result, is(expected));
    }
}
