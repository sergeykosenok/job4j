package ru.job4j.array;

public class FindLoop {

    public int getIndex(double[] data, double lookData) {
        int result = -1;
        boolean isFoundResult = false;
        for (int index = 0; index < data.length && !(isFoundResult); index++) {
            if (data[index] == lookData) {
                result = index;
                isFoundResult = true;
            }
        }
        return result;
    }
}
