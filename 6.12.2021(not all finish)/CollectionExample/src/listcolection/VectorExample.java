package listcolection;
import init.init;

import java.util.Vector;

public class VectorExample implements init {
    @Override
    public void initExample() {

        Vector vector = new Vector();

        vector.add("Tomato");
        vector.add("Strawberry");
        vector.add("Melon");
        vector.add("Apple");

        System.out.println(vector.capacity());
        System.out.println("First Element " + vector.firstElement());

        vector.forEach(item -> System.out.println(item));
    }
}
