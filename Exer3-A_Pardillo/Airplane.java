public class Airplane extends AirTransport {
    private int numberOfEngines;
    private double wingspan;
    
    public Airplane() {
        super();
        this.numberOfEngines = 2;
        this.wingspan = 30.0;
    }
    
    public Airplane(String name, int maxSpeed, int capacity, double maxAltitude, 
                   String propulsionType, int numberOfEngines, double wingspan) {
        super(name, maxSpeed, capacity, maxAltitude, propulsionType);
        this.numberOfEngines = numberOfEngines;
        this.wingspan = wingspan;
    }
    
    public void deployLandingGear() {
        System.out.println(getName() + " is deploying landing gear.");
    }
    
    // Getters and setters
    public int getNumberOfEngines() {
        return numberOfEngines;
    }
    
    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }
    
    public double getWingspan() {
        return wingspan;
    }
    
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
    
    @Override
    public String toString() {
        return "Airplane - " + super.toString() + ", Engines: " + numberOfEngines + ", Wingspan: " + wingspan + " m";
    }
}
