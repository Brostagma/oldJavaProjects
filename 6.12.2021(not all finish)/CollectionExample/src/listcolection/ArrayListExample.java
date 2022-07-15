package listcolection;
import init.init;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample implements init{
    @Override
    public void initExample() {

        ArrayList arrayList = new ArrayList();
        arrayList.add("Ankara");
        arrayList.add("Izmir");
        arrayList.add("Istanbul");
        arrayList.add("Ankara");

        arrayList.add(0,"Bursa");

        arrayList.remove(3);

        Iterator iterator = arrayList.iterator();

        /*
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        */

        arrayList.forEach(item -> System.out.println(item));
    }
}
