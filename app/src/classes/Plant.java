package src;
public class Plant {
    private String name;
    private String type;
    private String healthyStatus;
    private String userId;
    private String plantId;

    // Constructor
    public Plant(String name, String type, String healthyStatus, String userId, String plantId) {
        this.name = name;
        this.type = type;
        this.healthyStatus = healthyStatus;
        this.userId = userId;
        this.plantId = plantId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHealthyStatus() {
        return healthyStatus;
    }

    public void setHealthyStatus(String healthyStatus) {
        this.healthyStatus = healthyStatus;
    }

    public String getUserId() {
        return userId;
    }

    public String getPlantId() {
        return plantId;
    }

    // Methods to manage plants
    public void addPlant() {
        // Code to add plant to database or API
    }

    public void removePlant() {
        // Code to remove plant from database or API
    }

    public void updateHealthyStatus(String status) {
        setHealthyStatus(status);

        // Code to update plant's health status in database or API
    }
}
