package ru.job4j.condition;

/**
 Class points oparations
 */
public class Point {
    public double distance(int p1x, int p1y, int p2x, int p2y) {
        return Math.pow(Math.pow(p2x - p1x, 2) + Math.pow(p2y - p1y, 2), 0.5);
    }
}
