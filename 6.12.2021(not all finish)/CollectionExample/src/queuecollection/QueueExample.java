package queuecollection;
import init.init;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample implements init {

    @Override
    public void initExample() {
        Queue queue = new LinkedList();
        queue.add("Deniz");
        queue.add("Jack");

        queue.offer("Annie");

        System.out.println(queue);

        queue.forEach(item -> System.out.println(item));
    }
}
