package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;


public class TriangleTest {

    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Triangle triangle = new Triangle();
        double result = triangle.calcArea(0, 0, 0, 2, 2, 0);
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenAreaSetThreeSidesThenTriangleArea() {
        Triangle triangle = new Triangle();
        double result = triangle.calcArea(3, 4, 6);
        double expected = 5.33D;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenSetThreeSidesThenTrianglePerimeter() {
        Triangle triangle = new Triangle();
        double result = triangle.calcPerimeter(3, 4, 6);
        double expected = 13D;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenSetThreePointsThenTrianglePerimeter() {
        Triangle triangle = new Triangle();
        double result = triangle.calcPerimeter(0, 0, 0, 2, 2, 0);
        double expected = 6.83D;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenCreateTriangleByThreePointsThenTriangleArea() {
        Triangle triangle = new Triangle(0, 0, 0, 2, 2, 0);
        double result = triangle.calcArea();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenCreateTriangleByThreePointsThenTrianglePerimeter() {
        Triangle triangle = new Triangle(0, 0, 0, 2, 2, 0);
        double result = triangle.calcPerimeter();
        double expected = 6.83D;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenCreateTriangleByThreeSidesThenTrianglePerimeter() {
        Triangle triangle = new Triangle(3, 4, 6);
        double result = triangle.calcPerimeter();
        double expected = 13D;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenCreateTriangleByThreeSidesThenTriangleArea() {
        Triangle triangle = new Triangle(3, 4, 6);
        double result = triangle.calcArea();
        double expected = 5.33D;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenSetThreeSidesSuccessVar1ThenPossibilityCreateTriangle() {
        Triangle triangle = new Triangle();
        boolean result = triangle.isPossibleTriangleWithSides(4, 5, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenSetThreeSidesSuccessVar2ThenPossibilityCreateTriangle() {
        Triangle triangle = new Triangle();
        boolean result = triangle.isPossibleTriangleWithSides(4, 5, 7);
        assertThat(result, is(true));
    }

    @Test
    public void whenSetThreeSidesFailureVar1ThenPossibilityCreateTriangle() {
        Triangle triangle = new Triangle();
        boolean result = triangle.isPossibleTriangleWithSides(4, 5, 0.7);
        assertThat(result, is(false));
    }
    @Test

    public void whenSetThreeSidesFailureVar2ThenPossibilityCreateTriangle() {
        Triangle triangle = new Triangle();
        boolean result = triangle.isPossibleTriangleWithSides(4, 5, 10);
        assertThat(result, is(false));
    }
}
