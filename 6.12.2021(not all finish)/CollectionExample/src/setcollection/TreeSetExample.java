package setcollection;

import java.util.TreeSet;
import init.init;

public class TreeSetExample implements init {
    
    @Override
    public void initExample() {

        TreeSet treeSet = new TreeSet();
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(6);

        treeSet.forEach(item -> System.out.println(item));
    }
}
