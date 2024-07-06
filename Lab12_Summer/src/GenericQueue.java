import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E> {


    public GenericQueue() {
        super();
    }


    public void enqueue(E e) {
        addLast(e);
    }


    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }


    public int getSize() {
        return size();
    }

    
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
