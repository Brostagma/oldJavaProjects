package mapcollection;
import init.init;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample implements init{
    @Override
    public void initExample() {
        HashMap hashMap = new HashMap();

        hashMap.put("Turkey", "Ankara");
        hashMap.put("France", "Paris");
        hashMap.put("England", "London");

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry item = (Map.Entry) iterator.next();
            System.out.println(item.getKey() + " : " + item.getValue());
        }

    }
}
