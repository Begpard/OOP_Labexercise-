public class AirTransport extends Transportation {
    private double maxAltitude;
    private String propulsionType;
    
    public AirTransport() {
        super();
        this.maxAltitude = 0;
        this.propulsionType = "Unknown";
    }
    
    public AirTransport(String name, int maxSpeed, int capacity, double maxAltitude, String propulsionType) {
        super(name, maxSpeed, capacity);
        this.maxAltitude = maxAltitude;
        this.propulsionType = propulsionType;
    }
    
    public void takeOff() {
        System.out.println(getName() + " is taking off.");
    }
    
    public void land() {
        System.out.println(getName() + " is landing.");
    }
    
    // Getters and setters
    public double getMaxAltitude() {
        return maxAltitude;
    }
    
    public void setMaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }
    
    public String getPropulsionType() {
        return propulsionType;
    }
    
    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }
    
    public String toString() {
        return "Air " + super.toString() + ", Max Altitude: " + maxAltitude + " m, Propulsion: " + propulsionType;
    }
}
