package FacadeDesignPattern;

/**
 * Truck class that uses vehicle interface.
 */
public class Truck implements Vehicle{

    /**
     * Trick is built.
     */
    @Override
    public void build() {
        System.out.println("Building a truck...");
    }

    /**
     * Truck is painted.
     */
    @Override
    public void paint() {
        System.out.println("Painting truck...");
    }
    // Normally, this sort of class would contain various functionality to make it a more complex system
}
