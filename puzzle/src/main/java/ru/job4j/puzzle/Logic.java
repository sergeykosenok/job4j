package ru.job4j.puzzle;

import ru.job4j.puzzle.firuges.Cell;
import ru.job4j.puzzle.firuges.Figure;

import java.util.Arrays;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Logic {
    private final int size;
    private final Figure[] figures;
    private int index = 0;

    public Logic(int size) {
        this.size = size;
        this.figures = new Figure[size * size];
    }

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) {
        boolean rst = false;
        int index = this.findBy(source);
        if (index != -1) {
            Cell[] steps = this.figures[index].way(source, dest);
            if (this.isFree(steps)) {
                rst = true;
                this.figures[index] = this.figures[index].copy(dest);
            }
        }
        return rst;
    }

    public boolean isFree(Cell ... cells) {
        boolean result = cells.length > 0;
        for (Cell cell : cells) {
            if (this.findBy(cell) != -1) {
               result = false;
               break;
            }
        }
        return result;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * matchX[] в этом массиве хранятся индексы заполненных элементов первого ряда/колонки;
     * в последней ячейке matchX[] хранится его полезная длина
     * Алгоритм работы: сначала выясняем заполненные ячейки первого ряда,
     * затем ищем по найденным индексам совпадения в пересечении
     * @return
     */
    private boolean isSideWin(int[][] table, int side) {
        boolean result = false;
        boolean isMatch = false;
        int[] matchX = new int[table.length + 1];
        for (int i = 0; i < table.length; i++) {
            if (table[i * (1 - side)][i * side] == 1) {
                matchX[matchX[matchX.length - 1]] = i;
                matchX[matchX.length - 1]++;
            }
        }
        matchX = Arrays.copyOf(matchX, matchX[matchX.length - 1]);
        for (int i = 0; i < matchX.length && !result; i++) {
            isMatch = true;
            for (int j = 1; j < table.length && !result && isMatch; j++) {
                if (table[matchX[i] * (1 - side) + j * side][j * (1 - side) + matchX[i] * side] != 1) {
                    isMatch = false;
                }
            }
            result = isMatch;
        }
        return result;
    }

    private boolean isWinByPassingAllArray(int[][] table) {
        int matchX = 0;
        int matchY = 0;
        boolean isMatch = false;
        for (int i = 0; i < table.length && !isMatch; i++) {
            for (int j = 0; j < table.length && !isMatch; j++) {
                if (table[i][j] == 1) {
                    matchY++;
                }
                if (table[j][i] == 1) {
                    matchX++;
                }
            }
            if (matchY == table.length || matchX == table.length) {
                isMatch = true;
            }
            matchY = 0;
            matchX = 0;

        }
        return isMatch;
    }

    /**
     * исследуем последовательно горизонтальную и вертикальную стороны
     * @return
     */
    public boolean isWin() {
        int[][] table = this.convert();
        return isWinByPassingAllArray(table);
        //return (isSideWin(table, 0)) || (isSideWin(table, 1));
    }

    public int[][] convert() {
        int[][] table = new int[this.size][this.size];
        for (int row = 0; row != table.length; row++) {
            for (int cell = 0; cell != table.length; cell++) {
                int position = this.findBy(new Cell(row, cell));
                if (position != -1 && this.figures[position].movable()) {
                    table[row][cell] = 1;
                }
            }
        }
        return table;
    }
}
