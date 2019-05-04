package ru.job4j.loop;

public class Counter {

    public int add(int start, int finish) {
        int startloop = start % 2 != 0 ? start + 1 : start;
        int resultstock = 0;
        for (int i = startloop; i <= finish; i += 2) {
            resultstock += i;
        }
        return resultstock;
    }
}