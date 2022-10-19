public class task2 {
    public static void main(String[] args) {
        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
        // количество подряд идущих 1.
        int count = 0;
        int[] arr = new int[] {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1}
        ;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count += 1;
            else {
                max = count;
                count = 0;
            }
            if (max < count)
                max = count;
        }
        System.out.println(max);
    }
}
