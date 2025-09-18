public class Transportation {
    private String name;
    private int maxSpeed;
    private int capacity;
    
    public Transportation() {
        this.name = "Generic Transportation";
        this.maxSpeed = 0;
        this.capacity = 1;
    }
    
    public Transportation(String name, int maxSpeed, int capacity) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }
    
    public void move() {
        System.out.println(name + " is moving.");
    }
    
    public void stop() {
        System.out.println(name + " has stopped.");
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public String toString() {
        return "Transportation: " + name + ", Max Speed: " + maxSpeed + " km/h, Capacity: " + capacity + " people";
    }
}
