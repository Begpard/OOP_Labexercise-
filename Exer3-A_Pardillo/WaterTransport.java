public class WaterTransport extends Transportation {
    private double displacement;
    private String propulsionMethod;
    
    public WaterTransport() {
        super();
        this.displacement = 0;
        this.propulsionMethod = "Unknown";
    }
    
    public WaterTransport(String name, int maxSpeed, int capacity, double displacement, String propulsionMethod) {
        super(name, maxSpeed, capacity);
        this.displacement = displacement;
        this.propulsionMethod = propulsionMethod;
    }
    
    public void anchor() {
        System.out.println(getName() + " is dropping anchor.");
    }
    
    // Getters and setters
    public double getDisplacement() {
        return displacement;
    }
    
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
    
    public String getPropulsionMethod() {
        return propulsionMethod;
    }
    
    public void setPropulsionMethod(String propulsionMethod) {
        this.propulsionMethod = propulsionMethod;
    }
    
    @Override
    public String toString() {
        return "Water " + super.toString() + ", Displacement: " + displacement + 
               " tons, Propulsion: " + propulsionMethod;
    }
}
