package homework_1;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class task3 {
    public static int Calc(int a, int b,String choice, String pathFile) {
        int res = 0;
        Logger logger = homework_2.task1.WriteLog(pathFile);
        switch (choice) {
            case ("+"):
                res = a + b;
                logger.log(Level.INFO, String.format("%d + %d = %d", a,b,res));
                break;

            case ("-"):
                res = a - b;
                logger.log(Level.INFO, String.format("%d - %d = %d", a,b,res));
                break;

            case ("*"):
                res = a * b;
                logger.log(Level.INFO, String.format("%d * %d = %d", a,b,res));
                break;

            case ("/"):
                res = a / b;
                logger.log(Level.INFO, String.format("%d / %d = %d", a,b,res));
                break;

            default:
                break;
        }
        return res;
    }
    public static void main(String[] args) {
        // Реализовать простой калькулятор
        String pathProject = System.getProperty("user.dir");
        System.out.println(pathProject);
        String pathFile = pathProject.concat("/homework_1/task3.log");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        System.out.printf(
                "Введите + для сложения\nВведите - для вычетания\nВведите * для умножения\nВведите / для деления\n");
        System.out.printf(
                "Ввод: ");
        String choice = iScanner.next();
        iScanner.close();
        int res = Calc(a, b, choice, pathFile);
        System.out.printf("Результат = %d", res);
         
    }

}
