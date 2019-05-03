package ru.job4j.condition;

/**
 Class points oparations
 */
public class Point {
    public double distance(double p1x, double p1y, double p2x, double p2y) {
        return Math.pow(Math.pow(p2x - p1x, 2) + Math.pow(p2y - p1y, 2), 0.5);
    }
}
