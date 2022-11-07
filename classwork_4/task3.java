package classwork_4;

import java.util.LinkedList;
import java.util.Stack;

public class task3 {
    public static void AddStack(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        while(!st.empty()){
            System.out.print(st.pop() + " ");
        }
        
    }

    public static void AddLinkedList(int[] arr) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            ll.add(arr[i]);
        }
        System.out.println(ll);
    }

    public static void main(String[] args) {
        // 1) Написать метод, который принимает массив элементов, помещает их в стэк и
        // выводит на консоль содержимое стэка.

        // 2) Написать метод, который принимает массив элементов, помещает их в
        // linkedList и затем выводит его.

        int[] arr = new int[] { 10, 4, 6, 9, 99 };
        AddStack(arr);
        System.out.println();
        AddLinkedList(arr);
    }
}
