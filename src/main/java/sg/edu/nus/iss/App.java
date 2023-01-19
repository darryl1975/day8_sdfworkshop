package sg.edu.nus.iss;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // CollectionSortExample cse = new CollectionSortExample();
        // cse.example02();

        // ConcurrentHashMapExample chme = new ConcurrentHashMapExample();
        // chme.example();

        // LinkedListExample lle = new LinkedListExample();
        // lle.example();

        StackExample se = new StackExample();
        se.example();
    }
}
