public class Tricycle extends LandTransport {
    private boolean hasBasket;
    private String pedalType;
    
    public Tricycle() {
        super();
        this.hasBasket = true;
        this.pedalType = "Standard";
        setNumberOfWheels(3); // Override the default 4 wheels
        setFuelType("Human Power");
    }
    
    public Tricycle(String name, int maxSpeed, int capacity, boolean hasBasket, String pedalType) {
        super(name, maxSpeed, capacity, 3, "Human Power");
        this.hasBasket = hasBasket;
        this.pedalType = pedalType;
    }
    
    public void ringBell() {
        System.out.println(getName() + " is ringing its bell.");
    }
    
    // Getters and setters
    public boolean hasBasket() {
        return hasBasket;
    }
    
    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }
    
    public String getPedalType() {
        return pedalType;
    }
    
    public void setPedalType(String pedalType) {
        this.pedalType = pedalType;
    }
    
    @Override
    public String toString() {
        return "Tricycle - " + super.toString() + ", Basket: " + (hasBasket ? "Yes" : "No") + 
               ", Pedal Type: " + pedalType;
    }
}
