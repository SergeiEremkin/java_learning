package classwork_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class task1 {
public static void main(String[] args) {
    // 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.

    // 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

    ArrayList<Integer> al = new ArrayList<Integer>();
    LinkedList<Integer> ll = new LinkedList<Integer>();
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 100000000; i++) {
        al.add(i);
    }
    System.out.println(System.currentTimeMillis()-startTime);

    long startTime2 = System.currentTimeMillis();
    for (int i = 0; i < 100000000; i++) {
        ll.add(i);
    }
    //System.out.println(ll);
    System.out.println(System.currentTimeMillis()-startTime2);
}    
}
