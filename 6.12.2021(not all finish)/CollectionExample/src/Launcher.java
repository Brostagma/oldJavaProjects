import listcolection.*;
import mapcollection.*;
import queuecollection.*;
import setcollection.*;

public class Launcher {
    public static void main(String[] args) {

        HashSetExample hashSetExample = new HashSetExample();
        LinkedHashSetExample linkedHashSetExample = new LinkedHashSetExample();
        TreeSetExample treeSetExample = new TreeSetExample();
        ArrayListExample arrayListExample = new ArrayListExample();
        LinkedListExample linkedListExample = new LinkedListExample();
        VectorExample vectorExample = new VectorExample();
        QueueExample queueExample = new QueueExample();
        PriorityQueueExample priorityQueueExample = new PriorityQueueExample();
        HashMapExample hashMapExample = new HashMapExample();
        LinkedHashMapExample linkedHashMapExample = new LinkedHashMapExample();
        TreeMapExample treeMapExample = new TreeMapExample();


        hashSetExample.initExample();
        space(50);
        linkedHashSetExample.initExample();
        space(50);
        treeSetExample.initExample();
        space(50);
        arrayListExample.initExample();
        space(50);
        linkedListExample.initExample();
        space(50);
        vectorExample.initExample();
        space(50);
        queueExample.initExample();
        space(50);
        priorityQueueExample.initExample();
        space(50);
        hashMapExample.initExample();
        space(50);
        linkedHashMapExample.initExample();
        space(50);
        treeMapExample.initExample();

    }

    private static void space(int count){
        for (int i = 0; i < count; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
