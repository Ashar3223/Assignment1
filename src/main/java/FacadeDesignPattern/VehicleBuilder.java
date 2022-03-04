package FacadeDesignPattern;

/**
 * This facade class allows the classes that implement the interface to be accessed.
 */
public class VehicleBuilder {
    private Vehicle car;
    private Vehicle van;
    private Vehicle truck;

    /**
     * This class's constructor.
     */
    public VehicleBuilder() {
        car = new Car();
        van = new Van();
        truck = new Truck();
    }

    /**
     * The three functions below simply call their respective class's function.
     */
    public void buildCar() {
        car.build();
        car.paint();
    }

    public void buildVan() {
        van.build();
        van.paint();
    }

    public void buildTruck() {
        truck.build();
        truck.paint();
    }
}
