package ru.blinov.homework.lesson1.task1;

public class Main {

    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;
        long[][] array = new long[rows][columns];

        LinearCongruentialGenerator generator = new LinearCongruentialGenerator();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = generator.nextLong();
            }
        }

        printGrid(array);
        System.out.println("Max value of the array: " + getMaxValue(array));
        System.out.println("Min value of the array: " + getMinValue(array));
        System.out.println("Average value of the array: " + getAvgValue(array));
    }

    public static void printGrid(long[][] grid) {
        System.out.println("\nThe given 2D array:");
        for (long[] longs : grid) {
            for (long aLong : longs) {
                System.out.printf("%6d ", aLong);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static long getMaxValue(long[][] array) {
        long maxValue = array[0][0];
        for (long[] longs : array) {
            for (long aLong : longs) {
                if (aLong > maxValue) {
                    maxValue = aLong;
                }
            }
        }
        return maxValue;
    }

    public static long getMinValue(long[][] array) {
        long minValue = array[0][0];
        for (long[] longs : array) {
            for (long aLong : longs) {
                if (aLong < minValue) {
                    minValue = aLong;
                }
            }
        }
        return minValue ;
    }

    public static double getAvgValue(long[][] array) {
        int count = 0;
        double sum = 0;
        for (long[] longs : array) {
            for (long aLong : longs) {
                sum = sum + aLong;
                count++;
            }
        }
        return sum / count;
    }

    private static class LinearCongruentialGenerator {
        private long seed = System.currentTimeMillis();
        private static final long MULTIPLIER = 75;
        private static final long INCREMENT = 74;
        private static final long MODULUS = 65537;

        private long nextLong() {
            long nextLong = (MULTIPLIER * (seed) + INCREMENT) % MODULUS;
            seed = nextLong;
            return nextLong;
        }
    }
}
