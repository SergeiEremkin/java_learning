package homework_5;

import static java.lang.System.arraycopy;

public class task3 {

    public static int runs = 100;

    public static void main(String[] args) {
        int[] queens = new int[8];
        for (int i = 0; i < 8; i++) {
            queens[i] = (int) (Math.random() * 8);
        }
        System.out.println();
        System.out.println("Числовое представление доски:");
        display(queens);
        System.out.println("Визуальное представление доски:");
        displayBoard(queens);
        System.out.println("Возможные атаки: " + numOfAttacks(queens));
        System.out.println();
        System.out.println();
        int[] result = HillClimbing(queens);
        while (numOfAttacks(result) > 0 && runs > 0) {
            result = HillClimbing(result);
            runs--;
        }
        System.out.println("Числовое представление доски:");
        display(result);
        System.out.println("Визуальное представление доски:");
        displayBoard(result);
        System.out.println("Возможные атаки: " + numOfAttacks(result));
        System.out.println();

    }

    public static int[] HillClimbing(int[] queens) {
        int[] current = new int[8];
        int[] child = new int[8];
        current = queens;
        int[] next = { 0, 0, 0, 0, 0, 0, 0, 0 };
        while (1 == 1) {
            int min = 28;

            for (int i = 0; i < 64; i++) {
                child = createChild(current, i);
                int attacks = numOfAttacks(child);
                if (attacks < min) {
                    min = attacks;
                    arraycopy(child, 0, next, 0, 8);

                }
            }
            if (min >= numOfAttacks(current)) {
                return current;
            }
            arraycopy(next, 0, current, 0, 8);
        }
    }

    public static int numOfAttacks(int[] arr) {
        int row = 0;
        int major = 0;
        int minor = 0;

        int[] diagonal = { 0, 1, 2, 3, 4, 5, 6, 7 };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[i] == arr[j] && i != j) {
                    row++;
                }
            }
        }

        int[] tempMajor = new int[8];
        int[] tempMinor = new int[8];
        arraycopy(arr, 0, tempMajor, 0, 8);
        arraycopy(arr, 0, tempMinor, 0, 8);
        for (int i = 0; i < 8; i++) {
            tempMajor[i] -= diagonal[i];
            tempMinor[i] += diagonal[i];
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tempMajor[i] == tempMajor[j] && i != j) {
                    major++;
                }
                if (tempMinor[i] == tempMinor[j] && i != j) {
                    minor++;
                }
            }
        }
        return row + major + minor;
    }

    public static int[] createChild(int[] arr, int instance) {
        int[] child = new int[8];
        child = arr;
        int col = instance / 8;
        if (child[col] == 7) {
            child[col] = 0;
        } else {
            child[col] = ++child[col];
        }

        return child;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void displayBoard(int[] arr) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[j] == i) {
                    System.out.printf("%3s", "Q ");
                } else {
                    System.out.printf("%3s", "[]");
                }
            }
            System.out.println();
        }
    }

}
