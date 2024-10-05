public class User {
    private String name;
    private String location;
    private String userId;

    // Constructor
    public User(String name, String location, String userId) {
        this.name = name;
        this.location = location;
        this.userId = userId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    // Update profile in database (this method could be improved based on the database used)
    public void updateProfile(String name, String location) {
        setName(name);
        setLocation(location);


    }
}
