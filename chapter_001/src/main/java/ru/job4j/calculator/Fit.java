package ru.job4j.calculator;

/**
 Calculate perfect man fit
 @since 2019-05-02
 */
public class Fit {

    /**
     * Calculate perfect fit depend on man type
     * @param height is a person height
     * @param mantype: if person type man then value 1 but 2
     * @return perfect fit by kg
     */
    private double getPerfectFit(double height, int mantype) {
        if (mantype == 1) {
            return (height - 100) * 1.15;
        } else if (mantype == 2) {
            return (height - 110) * 1.15;
        } else {
            return -1;
        }
    }

    /**
     * Calculate perfect male weight
     * @param height of a man
     * @return perfect fit
     */
    public double manPerfectWeight(double height) {
        return this.getPerfectFit(height, 1);
    }

    /**
     * Calculate perfect female weight
     * @param height of a woman
     * @return perfect fit
     */
    public double womanPerfectWeight(double height) {
        return this.getPerfectFit(height, 2);
    }
}