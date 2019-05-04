package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenIn5ThenFactorial120() {
        Factorial fact = new Factorial();
        int result = fact.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    @Test
    public void whenIn0ThenFactorial1() {
        Factorial fact = new Factorial();
        int result = fact.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }

}
