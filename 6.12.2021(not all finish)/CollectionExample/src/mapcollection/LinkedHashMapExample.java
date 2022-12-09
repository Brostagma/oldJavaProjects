package mapcollection;
import init.init;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample implements init {

    @Override
    public void initExample() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Deniz",90);
        linkedHashMap.put("Jack", 80);
        linkedHashMap.put("Annie", 75);

        Set set = linkedHashMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry item = (Map.Entry) iterator.next();
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
