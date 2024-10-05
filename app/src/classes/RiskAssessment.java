package src;
import java.util.Date;

public class RiskAssessment {
    private String assessmentId;
    private String riskType;
    private String severity;
    private Date date;
    private String location;

    // Constructor
    public RiskAssessment(String assessmentId, String riskType, String severity, Date date, String location) {
        this.assessmentId = assessmentId;
        this.riskType = riskType;
        this.severity = severity;
        this.date = date;
        this.location = location;
    }

    // Getters and Setters
    public String getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Methods
    public void createAssessment() {
        // Code to create risk assessment in database or API
    }

    public void removeAssessment() {
        // Code to remove assessment from database or API
    }

    public void updateAssessment(String riskType, String severity) {
        setRiskType(riskType);
        setSeverity(severity);

        // Code to update risk assessment in database or API
    }

    public RiskAssessment getAssessmentByLocation(String location) {
        // Code to get risk assessment by location from database or API
        return this;
    }
}
