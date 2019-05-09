package ru.job4j.array;

public class BubbleSort {

    private double[] sortLeftToRight(double[] data, int lastChangesIndex) {
        int lastChangesIndexNext = lastChangesIndex;
        for (int index = 0; index < lastChangesIndex - 1; index++) {
            double tempCell = data[index];
            if (data[index] > data[index + 1]) {
                //change each other cells
                data[index] = data[index + 1];
                data[index + 1] = tempCell;
                lastChangesIndexNext = index + 1;
            }
        }
        if (lastChangesIndex != lastChangesIndexNext) {
            return this.sortLeftToRight(data, lastChangesIndexNext);
        } else {
            return data;
        }
    }

    public double[] sort(double[] data) {
        return this.sortLeftToRight(data, data.length);
    }
}
