package homework_1;

import java.util.Scanner;

public class task1 {
    public static int MakeSummNums(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static int MakeMultNums(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
        // чисел от 1 до n)
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        System.out.printf("Сумма чисел в диапазоне от 1 до %d равна: %d\n", n, MakeSummNums(n));
        System.out.printf("Произведение чисел в диапазоне от 1 до %d равна: %d", n, MakeMultNums(n));
    }
}
