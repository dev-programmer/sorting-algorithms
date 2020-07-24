package com.sorting.algorithms;

public class BubbleSort {

    public void bubbleSortIterative(int[] array) {
        boolean isSorted = true;
        int length = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < length; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
            length--;
        }
    }

    public void bubbleSortRecursive(int[] array, int length) {
        if (length <= 1) {
            return;
        }
        for (int j = 0; j < length; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
        bubbleSortRecursive(array, length - 1);
    }
}