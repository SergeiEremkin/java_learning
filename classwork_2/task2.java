package classwork_2;

public class task2 {
    public static void main(String[] args) {
        // Текст задачи:
        // Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
        // Ответ: результат - a4b3cd2 для примера
        String str = "aaabbbccccd ";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int index = str.charAt(4);
        System.out.println(index);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) {
                    sb.append(str.charAt(i));
                    count = 1;
                } else {
                    sb.append(str.charAt(i)).append(count);
                    count = 1;
                }

            }
        }
        System.out.println(sb.toString());

    }
}
