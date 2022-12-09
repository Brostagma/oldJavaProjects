package setcollection;

import java.util.HashSet;
import java.util.Iterator;
import init.init;

public class HashSetExample implements init {

    @Override
    public void initExample() {
        HashSet hashSet = new HashSet();
        hashSet.add("12 String");
        hashSet.add(12);
        hashSet.add(12.0);
        hashSet.add(true);
        hashSet.add(null);

        //hashSet.remove(12);
        //System.out.println(hashSet.contains(12));
        System.out.println(hashSet.size());
        Iterator iterator = hashSet.iterator();

        /*
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */
        hashSet.forEach(item -> System.out.println(item + " "));
    }
}
