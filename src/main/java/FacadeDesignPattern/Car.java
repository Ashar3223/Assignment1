package FacadeDesignPattern;

/**
 * Car class that uses vehicle interface.
 */
public class Car implements Vehicle{

    /**
     * Car is built.
     */
    @Override
    public void build() {
        System.out.println("Building car...");
    }

    /**
     * Car is painted.
     */
    @Override
    public void paint() {
        System.out.println("Painting car...");
    }
    // Normally, this sort of class would contain a lot more functionality making it a more complex system
}
