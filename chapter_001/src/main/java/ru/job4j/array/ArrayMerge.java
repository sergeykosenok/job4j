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
        int k =0;
        for (int i = 0; i < fstArray.length; i++) {
            mergeArray[k] = fstArray[i];
            k++;
            if (((i + 1 < fstArray.length) && (fstArray[i+1]>sndArray[0])) || (i + 1 == fstArray.length)) {
                for (int j = 0; j < sndArray.length; j++) {
                    mergeArray[k] = sndArray[j];
                    k++;
                }
            }

        }
        return mergeArray;
    }

}
