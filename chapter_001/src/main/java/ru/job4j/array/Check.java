package ru.job4j.array;

public class Check {

    public boolean mono(boolean[] data) {
        boolean firstCell = data[0];
        for (int index = 1; index < data.length; index++) {
            if (data[index] != firstCell) {
                return false;
            }
        }
        return true;
    }
}
