package queuecollection;
import init.init;

import java.util.PriorityQueue;

public class PriorityQueueExample implements init{
    @Override
    public void initExample() {

        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.add(80);
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(50);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
