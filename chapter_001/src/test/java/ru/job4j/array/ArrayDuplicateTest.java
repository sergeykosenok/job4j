package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesByReplaceThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayToCut = new ArrayDuplicate();
        String[] result = arrayToCut.removeByReplace(new String[]{"Hello", "Car", "Hello", "Cool", "World", "World"});
        String[] expected = new String[]{"Hello", "Car", "World", "Cool"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenNothingRemoveDuplicatesByReplaceThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayToCut = new ArrayDuplicate();
        String[] result = arrayToCut.removeByReplace(new String[]{"Hello", "Car", "World", "Cool"});
        String[] expected = new String[]{"Hello", "Car", "World", "Cool"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenAloneElementRemoveDuplicatesByReplaceThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayToCut = new ArrayDuplicate();
        String[] result = arrayToCut.removeByReplace(new String[]{"Hello"});
        String[] expected = new String[]{"Hello"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwinsElementsRemoveDuplicatesByReplaceThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayToCut = new ArrayDuplicate();
        String[] result = arrayToCut.removeByReplace(new String[]{"Hello", "Hello"});
        String[] expected = new String[]{"Hello"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenRemoveDuplicatesByGroupThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayToCut = new ArrayDuplicate();
        String[] result = arrayToCut.removeByGroup(new String[]{"Hello", "Car", "Hello", "Cool", "World", "World"});
        String[] expected = new String[]{"Hello", "Car", "Cool", "World"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenNothingRemoveDuplicatesByGroupThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayToCut = new ArrayDuplicate();
        String[] result = arrayToCut.removeByGroup(new String[]{"Hello", "Car", "Cool", "World"});
        String[] expected = new String[]{"Hello", "Car", "Cool", "World"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenAloneElementRemoveDuplicatesByGroupThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayToCut = new ArrayDuplicate();
        String[] result = arrayToCut.removeByGroup(new String[]{"Hello"});
        String[] expected = new String[]{"Hello"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwinsElementsRemoveDuplicatesByGroupThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayToCut = new ArrayDuplicate();
        String[] result = arrayToCut.removeByGroup(new String[]{"Hello", "Hello"});
        String[] expected = new String[]{"Hello"};
        assertThat(result, is(expected));
    }
}
