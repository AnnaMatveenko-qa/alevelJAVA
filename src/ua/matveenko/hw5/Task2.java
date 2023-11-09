package ua.matveenko.hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 6, 5, 3, 2, 1, 0};
        System.out.println(Arrays.toString(numbers));
        boolean result =checkDescending(numbers);
        System.out.println("descending check: " + result);
        System.out.println(Arrays.toString(numbers));
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