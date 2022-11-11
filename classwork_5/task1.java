package classwork_5;

import java.util.*;

public class task1 {
    public static void searchItem(Map<Integer, String> map, String forname) {

        for (var item : map.entrySet()) {
            if (item.getValue().equals(forname)) {
                System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
            }
        }
    }

    public static void main(String[] args) {
        // Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
        // организации.
        // 123456 Иванов
        // 321456 Васильев
        // 234561 Петрова
        // 234432 Иванов
        // 654321 Петрова
        // 345678 Иванов
        // Вывести данные по сотрудникам с фамилией Иванов.
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(4525, "Иванов");
        map.putIfAbsent(123456, "Иванов");
        map.putIfAbsent(321456, "Васильев");
        map.putIfAbsent(234561, "Петрова");
        map.putIfAbsent(654321, "Петрова");
        map.putIfAbsent(345678, "Иванов");
        System.out.println(map);
        searchItem(map, "Петрова");

    }
}
