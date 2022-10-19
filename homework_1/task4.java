
package homework_1;

public class task4 {
    public static int takeNumber(String q) {
        String[] arrQ = q.split("");
        int number = 0;
        int index = 0;
        for (int i = 0; i < arrQ.length; i++) {
            try {
                number = Integer.parseInt(arrQ[i]);
                index = i;
                if (index == 0) {
                    number *= 10;
                }
            } catch (NumberFormatException c) {
                System.out.println("Элемент не число");
            }
        }
        return number;
    }

    public static void checkDifference(String q, String w, int e) {
        int numQ = takeNumber(q);
        int numW = takeNumber(w);
        int numDiff = e - (numQ + numW);
        System.out.println(numDiff);
        if (numDiff >= 0) {
            int forNumQ = numDiff % 10;
            int forNumW = numDiff - forNumQ;
            int res = numQ + forNumQ + numW + forNumW;
            System.out.printf("%d + %d = %d", (numQ + forNumQ), (numW + forNumW), res);
        } else {
            System.out.println("Таких чисел нет");
        }
    }

    public static void main(String[] args) {
        // *+Задано уравнение вида q + w = e, q, w, e >= 0.
        // Некоторые цифры могут быть заменены знаком вопроса,
        // например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
        // Предложить хотя бы одно решение или сообщить, что его нет.
        String q = 2 + "?";
        String w = "?" + 5;
        int e = 69;
        checkDifference(q, w, e);
    }
}
