package ru.job4j.array;

public class MatrixCheck {

    boolean checkMonoDiagonal(boolean[][] data) {
        boolean firstDiagonal = data[0][0];
        boolean secondDiagonal = data[data.length - 1][0];
        for (int indexFirstLevel = 0; indexFirstLevel < data.length; indexFirstLevel++) {
            if (firstDiagonal != data[indexFirstLevel][indexFirstLevel]) {
                return false;
            }
            if (secondDiagonal != data[data.length - 1 - indexFirstLevel][indexFirstLevel]) {
                return false;
            }
        }
        return true;
    }
}
