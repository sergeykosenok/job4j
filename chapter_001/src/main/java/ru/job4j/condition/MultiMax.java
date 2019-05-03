package ru.job4j.condition;

public class MultiMax {

    public double max(double a, double b, double c) {
        Max max = new Max();
        return a >= b ? max.max(a, c) : max.max(b, c);
    }
}
