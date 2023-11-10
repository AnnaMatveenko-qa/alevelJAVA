package ua.matveenko.hw4;
/*
Заполнить одномерный массив случайными целочисленными значениями.
Все четные значения заменить на нули. Размер массива - 2000 элементов.
 */

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[2000];
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] targetArray = Arrays.copyOf(numbers, numbers.length);
        replacementOfElements(targetArray);
        System.out.println(Arrays.toString(targetArray));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        }
    }
    public static void replacementOfElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }

        }
    }
}
