package src;
public class WaterSource {
    private String waterId;
    private String location;
    private String qualityStatus;

    // Constructor
    public WaterSource(String waterId, String location, String qualityStatus) {
        this.waterId = waterId;
        this.location = location;
        this.qualityStatus = qualityStatus;
    }

    public String getWaterId() {
        return waterId;
    }

    public void setWaterId(String waterId) {
        this.waterId = waterId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getQualityStatus() {
        return qualityStatus;
    }

    public void setQualityStatus(String qualityStatus) {
        this.qualityStatus = qualityStatus;
    }

    // Methods for managing water sources
    public void addWaterSource() {
        // Code to add water source to database
    }

    public void removeWaterSource() {
        // Code to remove water source from database
    }

    public void updateQualityStatus(String status) {
        setQualityStatus(status);

        // Code to update the quality status in database
    }
}
//by Dragon
