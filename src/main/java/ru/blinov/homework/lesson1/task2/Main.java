package ru.blinov.homework.lesson1.task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};

        System.out.println("\nInitial array: " + Arrays.toString(array));
        countingSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        //Tests
        arraysShouldBeEqual();
        currentElementShouldBeLessThanOrEqualToTheNextOne();
    }

    public static void countingSort(int[] a) {

        if(a == null) {
            throw new IllegalArgumentException("The given array is null");
        }

        if(a.length == 0) {
            throw new IllegalArgumentException("The given array is empty");
        }

        if(a.length == 1) {
            return;
        }

        int maxNumber = (int) Double.NEGATIVE_INFINITY;
        for (int k : a) {
            if (k > maxNumber) {
                maxNumber = k;
            }
        }

        int[] count = new int[maxNumber + 1];

        for (int j : a) {
            count[j]++;
        }

        for (int i = 1; i <= maxNumber; i++) {
            count[i] = count[i] + count[i - 1];
        }

        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            b[--count[a[i]]] = a[i];
        }

        System.arraycopy(b, 0, a, 0, a.length);
    }

    /**
     * Test #1.
     * The given array should be equal to the expected one after sorting.
     */
    public static void arraysShouldBeEqual() {

        //Arrange
        int[] given = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        int[] expected = new int[]{1, 2, 3, 4, 5, 5, 6, 9};

        //Act
        countingSort(given);

        //Assert
        assert Arrays.equals(given, expected);
    }

    /**
     * Test #2.
     * The method loops through all the elements of the array
     * and asserts that the current element is less than or equal to the next one
     */
    public static void currentElementShouldBeLessThanOrEqualToTheNextOne() {

        //Arrange
        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};

        //Act
        countingSort(array);

        //Assert
        for (int i = 0; i < array.length - 1; i++) {
            assert array[i] <= array[i + 1];
        }
    }
}
