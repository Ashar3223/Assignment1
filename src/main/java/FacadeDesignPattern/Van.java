package FacadeDesignPattern;

/**
 * Van class that uses vehicle interface.
 */
public class Van implements Vehicle{

    /**
     * Van is built.
     */
    @Override
    public void build() {
        System.out.println("Building a van...");
    }

    /**
     * Van is painted
     */
    @Override
    public void paint() {
        System.out.println("Painting van...");
    }
    // Normally, this sort of class would contain various functionality making it a more complex system
}
