public class Booking {
    private String bicycleId;
    private String clientId;
    private String startDate;
    private String endDate;

    public Booking(String bicycleId, String clientId, String startDate, String endDate) {
        this.bicycleId = bicycleId;
        this.clientId = clientId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // id
    public String getBicycleId() {
        return this.bicycleId;
    }

    // clientId
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    // startDate
    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    // endDate
    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}