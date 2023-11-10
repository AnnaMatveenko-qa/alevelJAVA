package ua.matveenko.hw5;

import java.util.Arrays;


public class Task2 {
    public static void main(String[] args) {
        int[][] numbers = {{10, 9, 8, 7}, {5, 4, 3, 13}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
        int[] array = new int[numbers[0].length * numbers.length];
        copyTwoToOneArray(numbers, array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
        boolean result = checkDescending(array);
        System.out.println("descending check: " + result);
    }


    public static void copyTwoToOneArray(int[][] numbers, int[] array) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                array[count++] = numbers[i][j];
            }
        }
    }

    public static boolean checkDescending(int[] array) {
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                result = false;

                break;

            }
        }
        return result;
    }
}





