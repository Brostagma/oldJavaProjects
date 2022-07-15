public class GenericExample<Generic> {

    public void write(Generic[] generics) {
        System.out.println("------------------------------------");
        System.out.println(generics.getClass());
        System.out.println(generics.length);
        System.out.println("------------------------------------");
        for (Generic generic : generics) {

            System.out.println(generic);
        }
    }
}
