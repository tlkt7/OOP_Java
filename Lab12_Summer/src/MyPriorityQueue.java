import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue<E> {

    private PriorityQueue<E> priorityQueue;

    public MyPriorityQueue(Comparator<? super E> comparator) {
        priorityQueue = new PriorityQueue<>(comparator);
    }

    public void enqueue(E e) {
        priorityQueue.offer(e);
    }

    public E dequeue() {
        return priorityQueue.poll();
    }

    public int getSize() {
        return priorityQueue.size();
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }
}
