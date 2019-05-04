package ru.job4j.loop;

public class Factorial {

    public int calc(int i) {
        int result = 1;
        for (int f = 1; f <= i; f++) {
            result *= f;
        }
        return result;
    }
}
