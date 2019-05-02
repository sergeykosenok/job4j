package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {

    @Test
    public void whenHeight180ThenPerfectFitMan92()  {
        Fit fit = new Fit();
        double result = fit.manPerfectWeight(180);
        assertThat(result, closeTo(92.0, 0.1));
    }

    @Test
    public void whenHeight170ThenPerfectFitWoman69()  {
        Fit fit = new Fit();
        double result = fit.womanPerfectWeight(170);
        assertThat(result, closeTo(69.0, 0.1));
    }

}