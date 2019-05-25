package ru.job4j.array;

public class ArrayMerge {
    int[] merge(int[] left, int[] right) {
        int[] mergeArray = new int[left.length+right.length];
        int[] fstArray;
        int[] sndArray;
        if (left[0] > right[0]) {
            fstArray = left;
            sndArray = right;
        } else {
            fstArray = right;
            sndArray = left;
        }
        int m = 0;
        int i = 0;
        //int j = 0;
        do {
            mergeArray[m] = sndArray[i];
            m++;
            if (fstArray[i]>sndArray[0]) || (i+1 == fstArray.length) {
                for (int j = 0; j < sndArray.length; j++) {
                    mergeArray[m] = sndArray[j];
                    m++;
                }
            }
            i++;
        } while (i < fstArray.length);
    }

}
