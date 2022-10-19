package homework_1;

import java.util.Scanner;

public class task2 {
    public static boolean checkPrimeOrNot(int number) {
        boolean isPrime = true;
        if (0 == number || 1 == number) {
            System.out.println("0 и 1 не являются простыми числами");
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        return isPrime;
    }

    public static void printPrime(int number) {
        for (int i = 1; i <= number; i++) {
            if (checkPrimeOrNot(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        printPrime(n);
    }
}
