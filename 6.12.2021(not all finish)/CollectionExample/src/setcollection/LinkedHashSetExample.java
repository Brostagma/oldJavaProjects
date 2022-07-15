package setcollection;

import java.util.LinkedHashSet;
import init.init;

public class LinkedHashSetExample implements init {

    @Override
    public void initExample() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        linkedHashSet.add("e");
        linkedHashSet.add("f");
        linkedHashSet.add("g");
        linkedHashSet.add(12);
        linkedHashSet.add(null);

        linkedHashSet.forEach(item -> System.out.println(item + ", "));
    }
}
