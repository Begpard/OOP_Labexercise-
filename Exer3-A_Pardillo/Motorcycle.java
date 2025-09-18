public class Motorcycle extends LandTransport {
    private String motorcycleType;
    private boolean hasSidecar;
    
    public Motorcycle() {
        super();
        this.motorcycleType = "Standard";
        this.hasSidecar = false;
        setNumberOfWheels(2); // Override the default 4 wheels
    }
    
    public Motorcycle(String name, int maxSpeed, int capacity, String fuelType, 
                     String motorcycleType, boolean hasSidecar) {
        super(name, maxSpeed, capacity, 2, fuelType);
        this.motorcycleType = motorcycleType;
        this.hasSidecar = hasSidecar;
    }
    
    public void doWheelie() {
        System.out.println(getName() + " is doing a wheelie!");
    }
    
    // Getters and setters
    public String getMotorcycleType() {
        return motorcycleType;
    }
    
    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }
    
    public boolean hasSidecar() {
        return hasSidecar;
    }
    
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public String toString() {
        return "Motorcycle - " + super.toString() + ", Type: " + motorcycleType + 
               ", Sidecar: " + (hasSidecar ? "Yes" : "No");
    }
}
