public class Truck extends LandTransport {
    private double cargoCapacity;
    private boolean hasTrailer;
    
    public Truck() {
        super();
        this.cargoCapacity = 5000.0;
        this.hasTrailer = false;
    }
    
    public Truck(String name, int maxSpeed, int capacity, int numberOfWheels, 
                String fuelType, double cargoCapacity, boolean hasTrailer) {
        super(name, maxSpeed, capacity, numberOfWheels, fuelType);
        this.cargoCapacity = cargoCapacity;
        this.hasTrailer = hasTrailer;
    }
    
    public void loadCargo() {
        System.out.println(getName() + " is loading cargo.");
    }
    
    // Getters and setters
    public double getCargoCapacity() {
        return cargoCapacity;
    }
    
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    
    public boolean hasTrailer() {
        return hasTrailer;
    }
    
    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }
    
    @Override
    public String toString() {
        return "Truck - " + super.toString() + ", Cargo Capacity: " + cargoCapacity + 
               " kg, Trailer: " + (hasTrailer ? "Yes" : "No");
    }
}
