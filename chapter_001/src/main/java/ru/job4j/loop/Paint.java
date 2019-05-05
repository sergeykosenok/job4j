package ru.job4j.loop;

import java.util.function.BiPredicate;

public class Paint {

    public String piramid(int height) {

        StringBuilder outPiramid = new StringBuilder();

        int totalWidth = 2 * height - 1;
        int totalBricksInLine = 1;
        int halfSpacesInLine = (totalWidth - totalBricksInLine) / 2;

        for (int h = 0; h < height; h++) {

            for (int w = 0; w < halfSpacesInLine; w++) {
                outPiramid.append(" ");
            }

            for (int w = 0; w < totalBricksInLine; w++) {
                outPiramid.append("^");
            }

            for (int w = 0; w < halfSpacesInLine; w++) {
                outPiramid.append(" ");
            }

            totalBricksInLine += 2;
            halfSpacesInLine = (totalWidth - totalBricksInLine) / 2;

            outPiramid.append(System.lineSeparator());

        }
        return outPiramid.toString();
    }

    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}