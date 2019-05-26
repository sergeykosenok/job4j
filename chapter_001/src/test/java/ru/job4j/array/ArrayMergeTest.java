package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayMergeTest {
    @Test
    public void whenMergeArrayVar1ThenResult() {
        ArrayMerge arrayMerge = new ArrayMerge();
        int[] result = arrayMerge.merge(new int[]{1, 2}, new int[]{3, 4});
        int[] expected = new int[]{1, 2, 3, 4};
        assertThat(result, is(expected));
    }

    @Test
    public void whenMergeArrayVar2ThenResult() {
        ArrayMerge arrayMerge = new ArrayMerge();
        int[] result = arrayMerge.merge(new int[]{1, 2, 13, 14}, new int[]{5, 7, 9, 12});
        int[] expected = new int[]{1, 2, 5, 7, 9, 12, 13, 14};
        assertThat(result, is(expected));
    }
}
