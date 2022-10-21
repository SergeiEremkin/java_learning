package homework_3;

import java.util.ArrayList;

public class task3 {
    public static int Min(ArrayList<Integer> nums) {
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (min > nums.get(i)) {
                min = nums.get(i);
            }
        }
        return min;
    }

    public static int Max(ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (max < nums.get(i)) {
                max = nums.get(i);
            }
        }
        return max;
    }

    public static float Average(ArrayList<Integer> nums) {
        float sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    public static void main(String[] args) {
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и
        // среднее ариф. из этого списка
        ArrayList<Integer> nums = (new ArrayList<Integer>() {
            {
                add(23);
                add(8);
                add(3);
                add(3);
                add(5);
                add(6);
                add(10);
            }
        });
        System.out.println(Min(nums));
        System.out.println(Max(nums));
        System.out.printf("%.2f", Average(nums));
    }
}
