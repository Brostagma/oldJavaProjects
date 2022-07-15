package listcolection;
import init.init;

import java.util.LinkedList;

public class LinkedListExample implements init {
    @Override
    public void initExample() {

        LinkedList linkedList = new LinkedList();

        linkedList.add("Tomato");
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Melon");

        linkedList.add(0,"Strawberry");
        linkedList.remove(2);
        System.out.println(linkedList.get(2));

        linkedList.forEach(item -> System.out.println(item));

    }
}
