package homework_4;

import java.util.LinkedList;

public class task1 {
    public static LinkedList<Integer> ReverseLinkedList(LinkedList<Integer> ll){
        LinkedList<Integer> reverseLL = new LinkedList<>();
        for (int i = ll.size(); i >0 ; i--) {
            int element = ll.getLast();
            ll.remove(ll.getLast());
            reverseLL.addLast(element);
        }
        return reverseLL;
    }
    public static void main(String[] args) {
        //Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(23);
        ll.add(17);
        ll.add(10);
        ll.add(56);
        ll.add(101);
        ll.add(8);
        System.out.println(ll);
        LinkedList<Integer> result = ReverseLinkedList(ll);
        System.out.println(result);
    }
}
