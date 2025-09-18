public class Kariton extends LandTransport {
    private String material;
    private boolean hasCover;
    
    public Kariton() {
        super();
        this.material = "Wood";
        this.hasCover = false;
        setNumberOfWheels(0); // Kariton typically has no wheels
        setFuelType("Human Power");
        setMaxSpeed(5); // Very slow
    }
    
    public Kariton(String name, int capacity, String material, boolean hasCover) {
        super(name, 5, capacity, 0, "Human Power");
        this.material = material;
        this.hasCover = hasCover;
    }
    
    public void push() {
        System.out.println(getName() + " is being pushed.");
    }
    
    // Getters and setters
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public boolean hasCover() {
        return hasCover;
    }
    
    public void setHasCover(boolean hasCover) {
        this.hasCover = hasCover;
    }
    
    @Override
    public String toString() {
        return "Kariton - " + super.toString() + ", Material: " + material + 
               ", Cover: " + (hasCover ? "Yes" : "No");
    }
}
