public class Helicopter extends AirTransport {
    private int numberOfRotors;
    private boolean hasAutopilot;
    
    public Helicopter() {
        super();
        this.numberOfRotors = 1;
        this.hasAutopilot = false;
    }
    
    public Helicopter(String name, int maxSpeed, int capacity, double maxAltitude, 
                     String propulsionType, int numberOfRotors, boolean hasAutopilot) {
        super(name, maxSpeed, capacity, maxAltitude, propulsionType);
        this.numberOfRotors = numberOfRotors;
        this.hasAutopilot = hasAutopilot;
    }
    
    public void hover() {
        System.out.println(getName() + " is hovering in place.");
    }
    
    // Getters and setters
    public int getNumberOfRotors() {
        return numberOfRotors;
    }
    
    public void setNumberOfRotors(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }
    
    public boolean hasAutopilot() {
        return hasAutopilot;
    }
    
    public void setHasAutopilot(boolean hasAutopilot) {
        this.hasAutopilot = hasAutopilot;
    }
    
    @Override
    public String toString() {
        return "Helicopter - " + super.toString() + ", Rotors: " + numberOfRotors + 
               ", Autopilot: " + (hasAutopilot ? "Yes" : "No");
    }
}
