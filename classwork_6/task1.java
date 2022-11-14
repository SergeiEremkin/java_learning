


import java.util.*;

public class task1 {
    public static void main(String[] args) {
        // 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
        // 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
        // 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

        Set <Integer> set1 = new HashSet<Integer>(Arrays.asList(1000, 701, 303, 20, 44, 508, 600, 3));
        System.out.println(set1);
        Set <Integer> set4 = new HashSet<Integer>(Arrays.asList(0, 25, 6, 88, 250, 103, 205, 7));
        System.out.println(set4);
        Set <Integer> set5 = new HashSet<Integer>(Arrays.asList(0, 5, 6, 7, 10, 2, 3, 1));
        System.out.println(set5);
        Set <Integer> set2 = new LinkedHashSet<Integer>(Arrays.asList(1000, 701, 303, 20, 44, 508, 600, 3));
        System.out.println(set2);
        Set <Integer> set3 = new TreeSet<Integer>(Arrays.asList(1000, 701, 303, 20, 44, 508, 600, 3));
        System.out.println(set3);
        

    }
}
