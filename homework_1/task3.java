package homework_1;

import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task3 {
    // В калькулятор добавьте возможность отменить последнюю операцию.
    // Пример
    // 1+2
    // 3
    // +4
    // 7
    // Отмена
    // 3
    // *3
    // 9
    public static String ChoiceOperation() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(
                "Введите + для сложения\nВведите - для вычетания\nВведите * для умножения\nВведите / для деления\n");
        System.out.printf(
                "Ввод: ");
        String choice = iScanner.next();
        return choice;
    }

    public static Stack<Integer> CancelOperation(Stack<Integer> st) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите второе число: ");
        st.push(iScanner.nextInt());
        return st;

    }

    public static void Calc(Stack<Integer> st, String choice, String pathFile, Logger logger) {
        int res = 0;
        int b = st.pop();
        int a = st.pop();
        switch (choice) {
            case ("+"):
                res = a + b;
                logger.log(Level.INFO, String.format("%d + %d = %d", a, b, res));
                System.out.printf("Результат: %d + %d = %d\n", a, b, res);
                st.push(a);
                break;

            case ("-"):
                res = a - b;
                logger.log(Level.INFO, String.format("%d - %d = %d", a, b, res));
                System.out.printf("Результат: %d - %d = %d\n", a, b, res);
                st.push(a);
                break;

            case ("*"):
                res = a * b;
                logger.log(Level.INFO, String.format("%d * %d = %d", a, b, res));
                System.out.printf("Результат: %d * %d = %d\n", a, b, res);
                st.push(a);
                break;

            case ("/"):
                res = a / b;
                logger.log(Level.INFO, String.format("%d / %d = %d", a, b, res));
                System.out.printf("Результат: %d / %d = %d\n", a, b, res);
                st.push(a);
                break;

            default:
                break;

        }
    }

    public static void main(String[] args) {
        // Реализовать простой калькулятор
        Stack<Integer> st = new Stack<>();
        String pathProject = System.getProperty("user.dir");
        System.out.println(pathProject);
        String pathFile = pathProject.concat("/homework_1/task3.log");
        Scanner iScanner = new Scanner(System.in);
        Logger logger = homework_2.task1.WriteLog(pathFile);
        while (true) {
            System.out.printf("Введите первое число: ");
            st.push(iScanner.nextInt());
            System.out.printf("Введите второе число: ");
            st.push(iScanner.nextInt());
            String choice = ChoiceOperation();
            Calc(st, choice, pathFile, logger);
            System.out.println(
                    "Хотите отменить операцию?\nВведите 'yes'\nВведите 'no' для продолжение\nВведите 'exit' для выхода");
            choice = iScanner.next();
            if (choice.equals("yes")) {
                System.out.println("Первое число: " + st.peek());
                System.out.printf("Введите второе число: ");
                st.push(iScanner.nextInt());
                choice = ChoiceOperation();
                Calc(st, choice, pathFile, logger);
            }
            if (choice.equals("no")) {
                continue;
            }
            if (choice.equals("exit")) {
                break;
            }

        }

    }

}
