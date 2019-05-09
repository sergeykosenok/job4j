package ru.job4j.array;

public class ArrayChar {

    private char[] data;

    public ArrayChar(String string) {
        this.data = string.toCharArray();
    }

    public boolean startWith(String sample) {
        char[] sampleCharArray = sample.toCharArray();

        if (sampleCharArray.length > this.data.length) {
            return false;
        }

        for (int index = 0; index < sampleCharArray.length; index++) {
            if (this.data[index] != sampleCharArray[index]) {
                return false;
            }
        }
        return true;
    }
}
