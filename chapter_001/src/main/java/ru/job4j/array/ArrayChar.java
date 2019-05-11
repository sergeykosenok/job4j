package ru.job4j.array;

public class ArrayChar {

    private char[] data;

    public ArrayChar(String string) {
        this.data = string.toCharArray();
    }

    public boolean startWith(String sample) {
        char[] sampleCharArray = sample.toCharArray();
        int charMatch = 0;
        //отсекающий return в случае если искать не нужно из-за
        // несовместимости длины образца с исследуемой строкой
        if (sampleCharArray.length > this.data.length) {
            return false;
        }
        for (int index = 0; index < sampleCharArray.length && (sampleCharArray.length > charMatch); index++) {
            if (this.data[index] != sampleCharArray[index]) {
                break;
            }
            charMatch++;
        }
        return sampleCharArray.length == charMatch;
    }
}
