package homework_3;

import java.util.ArrayList;

public class task2 {
    public static ArrayList<Integer> RemoveEven(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
                i--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        ArrayList<Integer> nums = RemoveEven(new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(3);
                add(5);
                add(6);
                add(10);
            }
        });
        System.out.println(nums);
        ;
    }

}
