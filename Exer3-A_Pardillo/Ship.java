public class Ship extends WaterTransport {
    private int numberOfDecks;
    private String shipType;
    
    public Ship() {
        super();
        this.numberOfDecks = 1;
        this.shipType = "Cargo";
    }
    
    public Ship(String name, int maxSpeed, int capacity, double displacement, 
               String propulsionMethod, int numberOfDecks, String shipType) {
        super(name, maxSpeed, capacity, displacement, propulsionMethod);
        this.numberOfDecks = numberOfDecks;
        this.shipType = shipType;
    }
    
    public void soundHorn() {
        System.out.println(getName() + " is sounding its deep horn.");
    }
    
    // Getters and setters
    public int getNumberOfDecks() {
        return numberOfDecks;
    }
    
    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }
    
    public String getShipType() {
        return shipType;
    }
    
    public void setShipType(String shipType) {
        this.shipType = shipType;
    }
    
    @Override
    public String toString() {
        return "Ship - " + super.toString() + ", Decks: " + numberOfDecks + 
               ", Type: " + shipType;
    }
}
