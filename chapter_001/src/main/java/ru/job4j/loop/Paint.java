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
}