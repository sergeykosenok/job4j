package ru.job4j.array;

public class FindLoop {

    public int getIndex(double[] data, double lookData) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == lookData) {
                return index;
            }
        }
        return -1;
    }
}
