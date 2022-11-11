package homework_5;

import java.util.*;

public class task2 {
    public static void showSortedNames(String[] array) {
        Map<String, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].split(" ")[0].equals(array[j].split(" ")[0])) {
                    counter++;
                }
            }
            map.putIfAbsent(array[i].split(" ")[0], counter);
            counter = 0;
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        // Пусть дан список сотрудников:
        // Иван Иванов
        // Светлана Петрова
        // Кристина Белова
        // Анна Мусина
        // Анна Крутова
        // Иван Юрин
        // Петр Лыков
        // Павел Чернов
        // Петр Чернышов
        // Мария Федорова
        // Марина Светлова
        // Мария Савина
        // Мария Рыкова
        // Марина Лугова
        // Анна Владимирова
        // Иван Мечников
        // Петр Петин
        // Иван Ежов

        // Написать программу, которая найдет и выведет повторяющиеся имена с
        // количеством повторений. Отсортировать по убыванию популярности Имени.
        String[] array = new String[] {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов",
        };
        showSortedNames(array);
    }
}
