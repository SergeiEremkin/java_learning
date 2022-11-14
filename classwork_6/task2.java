

import java.util.*;

public class task2 {
    public static Integer[] fillArray() {
        Random random = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 100);
        }
        return arr;
    }

    public static void CountElements(Integer[] arr, Set<Integer> set) {
        System.out.print((((double) set.size() * 100) / (double) arr.length + "%"));
    }

    public static void main(String[] args) {
        // 1. Напишите метод, который заполнит массив из 1000 элементов случайными
        // цифрами от 0 до 24.
        // 2. Создайте метод, в который передайте заполненный выше массив и с помощью
        // Set вычислите процент уникальных значений в данном массиве и верните его в
        // виде числа с плавающей запятой.
        // Для вычисления процента используйте формулу:
        // процент уникальных чисел = количество уникальных чисел * 100 / общее
        // количество чисел в массиве.
        Integer[] arr = fillArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr));
        System.out.println(set1);
        CountElements(arr, set1);
        
    }
}
