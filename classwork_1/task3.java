public class task3 {

    static void pushToEnd(int arr[], int n) {
        int count = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] != 3) {
                arr[count++] = arr[i];
                System.out.println(arr[i]);
            }
        while (count < n)
            arr[count++] = 3;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 3, 2 };
        int n = arr.length;
        pushToEnd(arr, n);
        System.out.println("Результат: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
