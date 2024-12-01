package jagrit.dewan.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TesttingQueue {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        queue.offer(5);
        Utilityclass.print(queue);
        queue.remove();
        Utilityclass.print(queue);
        queue.poll();
        Utilityclass.print(queue);

    }
}
