package classwork_3;

import java.util.ArrayList;

public class task4 {

    public static void main(String[] args) {
        // Создать список типа ArrayList
        // Поместить в него как строки, так и целые числа. 
        // Пройти по списку, найти и удалить целые числа.
        ArrayList array = new ArrayList<>();
        array.add(1);
        array.add(45);
        array.add(45);
        array.add("строка");
        array.add("значение");
        array.add("значение");
        array.add("значение");
        array.add("значение");
        array.add("значение");
        array.add("значение");
        array.add("значение");
        array.add(45);
        array.add(45);
        array.add(45);
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof Integer){
                array.remove(i);
                i-=1;
            }
        }
        System.out.println(array);
    }
}
