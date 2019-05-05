package ru.job4j.loop;

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
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != height; column++) {
                // если строка равна ячейки, то рисуем галку.
                // в данном случае строка определяем, сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }

    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != height; column++) {
                if (row >= height - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
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