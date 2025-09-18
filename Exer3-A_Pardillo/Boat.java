public class Boat extends WaterTransport {
    private String boatType;
    private boolean hasMotor;
    
    public Boat() {
        super();
        this.boatType = "Rowboat";
        this.hasMotor = false;
    }
    
    public Boat(String name, int maxSpeed, int capacity, double displacement, 
               String propulsionMethod, String boatType, boolean hasMotor) {
        super(name, maxSpeed, capacity, displacement, propulsionMethod);
        this.boatType = boatType;
        this.hasMotor = hasMotor;
    }
    
    public void row() {
        if (!hasMotor) {
            System.out.println(getName() + " is being rowed.");
        } else {
            System.out.println(getName() + " has a motor, no need to row.");
        }
    }
    
    // Getters and setters
    public String getBoatType() {
        return boatType;
    }
    
    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }
    
    public boolean hasMotor() {
        return hasMotor;
    }
    
    public void setHasMotor(boolean hasMotor) {
        this.hasMotor = hasMotor;
    }
    
    @Override
    public String toString() {
        return "Boat - " + super.toString() + ", Type: " + boatType + 
               ", Motor: " + (hasMotor ? "Yes" : "No");
    }
}
