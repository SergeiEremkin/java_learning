package homework_5;

import java.util.*;

public class task1 {
    public static void addContact(String name, Integer number, Map<String, ArrayList<Integer>> book) {

        if (!book.containsKey(name)) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(number);
            book.put(name, numbers);
        } else {
            var numbers = book.get(name);
            numbers.add(number);
            book.put(name, numbers);
        }
    }

    public static void showBook(Map<String, ArrayList<Integer>> book) {
        for (var c : book.entrySet()) {
            System.out.printf("%s %s\n", c.getKey(), c.getValue().toString());
        }
    }

    public static void main(String[] args) {
        // Реализуйте структуру телефонной книги с помощью HashMap, учитывая что один
        // человек может иметь несколько телефонов.
        Map<String, ArrayList<Integer>> book = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);
        Integer count = 5;
        while (count > 0) {
            System.out.printf("Введите имя: ");
            String name = scanner.nextLine();
            System.out.println(name);
            System.out.printf("Введите телефон: ");
            Integer number = scanner.nextInt();
            addContact(name, number, book);
            System.out.printf("\n");
            scanner.nextLine();
            count--;
        }
        scanner.close();
        showBook(book);

    }

}
