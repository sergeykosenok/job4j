package ru.job4j.loop;

public class Board {

    public String paint(int width, int height) {
        StringBuilder outBoard = new StringBuilder();

        //флаг нечетности ячеек в линии доски
        boolean isOdd = width % 2 > 0;

        //символы для формирования доски
        char[] symbols = new char[] {'X', ' '};
        String pairSymbols = "X ";

        //индекс допсимвола
        int indexSuf = 0;

        for (int h = 0; h < height; h++) {

            for (int w = 1; w < width; w += 2) {
                outBoard.append(pairSymbols);
            }

            //дописываем дополнительный символ, если ширина доски из нечетного кол-ва
            if (isOdd) {
                outBoard.append(symbols[indexSuf]);
            }
            //перевод строки
            outBoard.append(System.lineSeparator());

            //изменим индекс для извлечения дополнительного символа
            indexSuf = (indexSuf - 1) * (-1);

            //изменим пару символов для формирования следующей линии доски в цикле
            pairSymbols = symbols[indexSuf] + Character.toString(symbols[(indexSuf - 1) * (-1)]);

        }
        return outBoard.toString();
    }
}
