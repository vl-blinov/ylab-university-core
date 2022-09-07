package ru.blinov.homework.lesson2.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{3, 4, 2, 7};
        int k = 10;

        printPairSum(array, k);
    }

    private static void printPairSum(int[] array, int k) {
        if (array != null) {
            int[] result = new int[2];
            List<Integer> list = new ArrayList<>();
            for (int i : array) {
                if (list.contains(k - i)) {
                    result[0] = k - i;
                    result[1] = i;
                    break;
                }
                list.add(i);
            }
            System.out.println(Arrays.toString(result));
        } else {
            throw new IllegalArgumentException("Array must not be null");
        }
    }
}
