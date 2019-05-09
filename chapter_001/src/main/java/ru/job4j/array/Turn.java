package ru.job4j.array;

public class Turn {

    public double[] getBack(double[] data) {
        int index = 0;
        while (index < data.length - index - 1) {
            double tempData = data[index];
            data[index] = data[data.length - index - 1];
            data[data.length - index - 1] = tempData;
            index++;
        }
        return data;
    }
}
