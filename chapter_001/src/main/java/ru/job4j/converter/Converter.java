package ru.job4j.converter;

/**
 Converter currency class
*/
public class Converter {
    private final float rubToUSDExchange = 60.0F;
    private final float rubToEurExchange = 70.0F;

    /**
     Rub 2 USD convert method
    */
    public float rubToUSD(float rub) {
        return rub / this.rubToUSDExchange;
    }

    /**
     Rub 2 EUR convert method
    */
    public float rubToEUR(float rub) {
        return rub / this.rubToEurExchange;
    }

    /**
     EUR 2 rub convert method
    */
    public float eurToRub(float eur) {
        return eur * this.rubToEurExchange;
    }

    /**
     USD 2 rub convert method
    */
    public float usdToRub(float usd) {
        return usd * this.rubToUSDExchange;
    }
}