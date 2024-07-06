import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();


        final int SIZE = 1000000;
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }


        long startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time using iterator: " + (endTime - startTime) + " ms");


        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time using get(index): " + (endTime - startTime) + " ms");
    }
}
