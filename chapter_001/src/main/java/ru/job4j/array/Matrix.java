package ru.job4j.array;

public class Matrix {

    public int[][] multiple(int size) {
        int[][] outArray = new int[size][size];
        for (int indexFirstLevel = 0; indexFirstLevel < size; indexFirstLevel++) {
            for (int indexSecondLevel = 0; indexSecondLevel < size; indexSecondLevel++) {
                outArray[indexFirstLevel][indexSecondLevel] = (indexFirstLevel + 1) * (indexSecondLevel + 1);
            }
        }
        return outArray;
    }
}
