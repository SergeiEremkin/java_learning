import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num1 = Math.abs(iScanner.nextInt());
        System.out.printf("Введите второе число: ");
        int num2 = Math.abs(iScanner.nextInt());
        iScanner.close();
        if (num1 == Math.pow(num2, 2) || num2 == Math.pow(num1, 2)) {
            System.out.println("Да");
        } else
            System.out.println("Нет");
    }
}

