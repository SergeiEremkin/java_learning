package homework_2;

import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class task1 {
    public static void bubbleSort(int arr[],String pathFile) {
        int n = arr.length;
        var logger = WriteLog(pathFile);
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    logger.log(Level.INFO, String.format("%s больше %s. Элементы поменяны местами.",
                            String.valueOf(arr[j + 1]), String.valueOf(arr[j])));
                }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static Logger WriteLog(String pathFile) {
        try {

            Logger logger = Logger.getLogger(task1.class.getName());
            FileHandler fh = new FileHandler(pathFile, true);
            fh.setEncoding("UTF-8");
            logger.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
            return logger;
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        // Реализуйте алгоритм сортировки пузырьком числового массива, результат после
        // каждой итерации запишите в лог-файл.
        int arr[] = { 64, 34, 25, 90, 12, 22, 11 };
        String pathProject = System.getProperty("user.dir");
        System.out.println(pathProject);
        String pathFile = pathProject.concat("/homework_2/task1.log");
        printArray(arr);
        bubbleSort(arr, pathFile );
        printArray(arr);

    }
}
