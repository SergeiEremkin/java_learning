package classwork_3;

import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        // Заполнить список названиями планет Солнечной системы в произвольном порядке с
        // повторениями. Вывести название каждой планеты и количество его повторений в
        // списке.
        ArrayList planet = new ArrayList<>();
        int count = 0;
        planet.add("Земля");
        planet.add("Солнце");
        planet.add("Юпитер");
        planet.add("Марс");
        planet.add("Сатурн");
        planet.add("Марс");
        for (int i = 0; i < planet.size(); i++) {
            for (int j = 0; j < planet.size(); j++) {
                if (planet.get(i).equals(planet.get(j))) {
                    count++;
                }
            }
            System.out.printf("%s, %d\n", planet.get(i), count);
            count = 0;
        }

    }
}
