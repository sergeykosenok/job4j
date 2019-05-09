package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        double[] input = new double[] {4, 1, 6, 2};
        double[] result = turner.getBack(input);
        double[] expect = new double[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        double[] input = new double[] {4, 1, 6, 2, 7};
        double[] result = turner.getBack(input);
        double[] expect = new double[] {7, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOneAloneAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        double[] input = new double[] {7};
        double[] result = turner.getBack(input);
        double[] expect = new double[] {7};
        assertThat(result, is(expect));
    }
}
