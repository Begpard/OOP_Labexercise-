public class LandTransport extends Transportation {
    private int numberOfWheels;
    private String fuelType;
    
    public LandTransport() {
        super();
        this.numberOfWheels = 4;
        this.fuelType = "Gasoline";
    }
    
    public LandTransport(String name, int maxSpeed, int capacity, int numberOfWheels, String fuelType) {
        super(name, maxSpeed, capacity);
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
    }
    
    public void honk() {
        System.out.println(getName() + " is honking its horn.");
    }
    
    // Getters and setters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    
    public String getFuelType() {
        return fuelType;
    }
    
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    @Override
    public String toString() {
        return "Land " + super.toString() + ", Wheels: " + numberOfWheels + ", Fuel: " + fuelType;
    }
}
