package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {

    /**
     * Метод убирает дубли в одномерном массиве путем последовательного прохода его слева направо,
     * вставляя на место встречающихся дублей элементы с конца массива. Порядок расположения элементов
     * может нарушиться.
     */
    private String[] replaceDoublesBySingles(String[] data, int startIndex, int finishIndex) {
        String tempSample = data[startIndex];
        for (int index = startIndex + 1; index < finishIndex; index++) {
            if (data[index].equals(tempSample)) {
                data[index] = data[finishIndex - 1];
                finishIndex--;
            }
        }
        if (startIndex < finishIndex - 1) {
            return this.replaceDoublesBySingles(data, startIndex + 1, finishIndex);
        } else {
            return Arrays.copyOf(data, finishIndex);
        }
    }

    /**
     *Метод убирает дубли в одномерном массиве путем последовательного прохода его слева направо,
     * схлопывая массив в месте появления дублей. Порядок расположения элементов массива остается неизменным.
     */
    private String[] groupSinglesWithoutDoubles(String[] data, int startIndex, int finishIndex) {
        String tempSample = data[startIndex];
        int shift = 0;
        for (int index = startIndex + 1; index < finishIndex; index++) {
            if (data[index].equals(tempSample)) {
                shift++;
                continue;
            }
            if (shift > 0) {
                data[index - shift] = data[index];
            }
        }
        if (startIndex + 1 < finishIndex - shift) {
            return this.groupSinglesWithoutDoubles(data, startIndex + 1, finishIndex - shift);
        } else {
            return Arrays.copyOf(data, finishIndex - shift);
        }
    }

    public String[] removeByReplace(String[] data) {
        return replaceDoublesBySingles(data, 0,  data.length);
    }

    public String[] removeByGroup(String[] data) {
        return groupSinglesWithoutDoubles(data, 0,  data.length);
    }
}
