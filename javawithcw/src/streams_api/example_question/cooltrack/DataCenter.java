package streams_api.example_question.cooltrack;

public class DataCenter {
    private String dataCenterId;
    private String location;
    private String supervisorName;
    private double coolingPowerUsage;

    public DataCenter(String dataCenterId, String location, String supervisorName, double coolingPowerUsage) {
        this.dataCenterId = dataCenterId;
        this.location = location;
        this.supervisorName = supervisorName;
        this.coolingPowerUsage = coolingPowerUsage;
    }


    public String getDataCenterId() {
        return dataCenterId;
    }

    public void setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public double getCoolingPowerUsage() {
        return coolingPowerUsage;
    }

    public void setCoolingPowerUsage(double coolingPowerUsage) {
        this.coolingPowerUsage = coolingPowerUsage;
    }

    @Override
    public String toString() {
        return dataCenterId + " | " + location + " | " + supervisorName + " | "  + coolingPowerUsage;
    }
}
