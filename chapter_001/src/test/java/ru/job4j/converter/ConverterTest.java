package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubToUSDThen1() {
        Converter converter = new Converter();
        float result = converter.rubToUSD(60);
        assertThat(result, is(1F));
    }

    @Test
    public void when70RubToEURThen1() {
        Converter converter = new Converter();
        float result = converter.rubToEUR(70);
        assertThat(result, is(1F));
    }

    @Test
    public void when1EURToRubThen70() {
        Converter converter = new Converter();
        float result = converter.eurToRub(1);
        assertThat(result, is(70F));
    }

    @Test
    public void when1USDToRubThen60() {
        Converter converter = new Converter();
        float result = converter.usdToRub(1);
        assertThat(result, is(60F));
    }
}