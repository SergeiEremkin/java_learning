package lecture3;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class task1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.offer(2); 
        System.out.println(queue);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(2);
        pq.add(441);
        pq.add(22);
        int elem = pq.element();
        System.out.println(elem);
    }
}
