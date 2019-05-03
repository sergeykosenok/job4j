package ru.job4j.condition;

public class Triangle {

    private double perimeter;
    private double area;
    private double[] sides;

    private double calcGeronArea(double a, double b, double c) {
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    private double[] calcTriangleSidesByPoints(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
        double[] triangleSides = new double[3];
        Point point = new Point();
        triangleSides[0] = point.distance(p1x, p1y, p2x, p2y);
        triangleSides[1] = point.distance(p1x, p1y, p3x, p3y);
        triangleSides[2] = point.distance(p3x, p3y, p2x, p2y);
        return triangleSides;
    }

    public Triangle(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
        this.sides = this.calcTriangleSidesByPoints(p1x, p1y, p2x, p2y, p3x, p3y);
        this.perimeter = this.sides[0] + this.sides[1] + this.sides[2];
        this.area = this.calcGeronArea(this.sides[0], this.sides[1], this.sides[2]);
    }

    public Triangle(double a, double b, double c) {
        this.sides = new double[3];
        this.sides[0] = a;
        this.sides[1] = b;
        this.sides[2] = c;
        this.perimeter = this.sides[0] + this.sides[1] + this.sides[2];
        this.area = this.calcGeronArea(a, b, c);
    }

    public Triangle() {
    }

    public double calcPerimeter(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
        double[] sides = this.calcTriangleSidesByPoints(p1x, p1y, p2x, p2y, p3x, p3y);
        return sides[0] + sides[1] + sides[2];
    }

    public double calcPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public double calcPerimeter() {
        return this.perimeter;
    }

    public double calcArea(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
        double[] sides = this.calcTriangleSidesByPoints(p1x, p1y, p2x, p2y, p3x, p3y);
        return this.calcGeronArea(sides[0], sides[1], sides[2]);
    }

    public double calcArea(double a, double b, double c) {
        return this.calcGeronArea(a, b, c);
    }

    public double calcArea() {
        return this.area;
    }

    public boolean isPossibleTriangleWithSides(double a, double b, double c) {
        return !(a + b <= c);
    }
}
