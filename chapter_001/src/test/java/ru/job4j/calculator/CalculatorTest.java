package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
Calculator test class
*/
public class CalculatorTest  {

	/**
	add method test
	*/
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

	/**
	multiple method test
	*/
    @Test
    public void whenMultipleTwoAndTwoThenFour()  {
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }

	/**
	div method test
	*/
    @Test
    public void whenDivFourAndTwoThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.div(4D, 2D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

	/**
	subtract method test
	*/
    @Test
    public void whenSubtractFourAndTwoThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.subtract(4D, 2D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
