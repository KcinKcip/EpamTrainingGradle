package com.epam.algo;

public class BinarySearch {
    public int binarySearch(int elementToFind, int[] array) {
        int lowerBoundary = 0;
        int higherBoundary = array.length - 1;

        while (lowerBoundary <= higherBoundary) {
            int middle = lowerBoundary + (higherBoundary - lowerBoundary) / 2;

            if (elementToFind < array[middle]) {
                higherBoundary = middle - 1;
            } else if (elementToFind > array[middle]) {
                lowerBoundary = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
