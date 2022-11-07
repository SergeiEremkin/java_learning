package classwork_4;

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void DeleteElement(LinkedList<String> ll) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Введите текст: ");
            input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            var element = input.split("~");
            if (element[0].equals("print")) {
                System.out.println(element[0]);
                ll.remove(element[0]);
            }
        }
    }

    public static LinkedList<String> AddElement() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();
        String input = "";
        while (true) {
            System.out.println("Введите текст: ");
            input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            var element = input.split("~");
            ll.add(Integer.parseInt(element[1]), element[0]);

        }
        return ll;
    }

    public static void main(String[] args) {

        // Реализовать консольное приложение, которое:

        // 1. Принимает от пользователя строку вида

        // text~num

        // . Нужно рассплитить строку по ~, сохранить text в связный список на позицию
        // num.
        // 2. Если введено print~num, выводит строку из позиции num в связном списке и
        // удаляет её из списка.

        LinkedList<String> ll = AddElement();
        System.out.println(ll);
        DeleteElement(ll);
        System.out.println(ll);

    }

}
