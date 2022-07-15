public class Launcher {

    public static void main(String[] args) {

        try {
            System.out.println("TRUE");
            new Window();
        }
        catch (Exception e) {
            System.err.println("Something went wrong");
        }
    }
}
