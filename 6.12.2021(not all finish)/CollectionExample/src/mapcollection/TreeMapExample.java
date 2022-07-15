package mapcollection;
import init.init;

import java.util.*;

public class TreeMapExample implements init {

    @Override
    public void initExample() {
        TreeMap treeMap = new TreeMap();
        treeMap.put("Deniz",90);
        treeMap.put("Jack", 80);
        treeMap.put("Annie", 75);

        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry item = (Map.Entry) iterator.next();
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
