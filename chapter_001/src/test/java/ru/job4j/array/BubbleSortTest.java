package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort arrayToSort = new BubbleSort();
        double[] result = arrayToSort.sort(new double[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5});
        double[] expected = new double[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortArrayWithSevenElementsThenSortedArray() {
        BubbleSort arrayToSort = new BubbleSort();
        double[] result = arrayToSort.sort(new double[]{9, 0, 3, 7, 3, 0, 9});
        double[] expected = new double[]{0, 0, 3, 3, 7, 9, 9};
        assertThat(result, is(expected));
    }
}

