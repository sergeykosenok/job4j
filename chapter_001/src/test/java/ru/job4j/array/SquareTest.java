package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenBound3ThenSquareArray149() {
        Square multsquare = new Square();
        int[] result = multsquare.calculate(3);
        int[] expected = new int[]{1, 4, 9};
        assertThat(result, is(expected));
    }

    @Test
    public void whenBound4ThenSquareArray1491625() {
        Square multsquare = new Square();
        int[] result = multsquare.calculate(5);
        int[] expected = new int[]{1, 4, 9, 16, 25};
        assertThat(result, is(expected));
    }
}
