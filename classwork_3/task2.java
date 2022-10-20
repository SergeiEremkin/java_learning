package classwork_3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
public class task2 {
    public static void main(String[] args) {
        // Заполнить список десятью случайными числами. 
        // Отсортировать список методом sort() и вывести его на экран.
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(1,11));
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);


    }
}
