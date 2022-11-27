public class Rent {
    private String id;
    private String clientId;
    private String startDate;
    private String endDate;

    public Rent(String id,String clientId,String  startDate,String endDate) {
        this.id= id;
        this.clientId= clientId;
        this.startDate= startDate;
        this.endDate= endDate;

    }
    //id
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id= id;
    }
    //clientid
    public String getClientId(){
        return this.clientId;
    }
    public void setClientId(String clientId){
        this.clientId = clientId;
    }
    //startdate
    public String getStartDate(){
        return this.startDate;
    }
    public void setStartDate(String startDate){
        this.startDate= startDate;
    }
    //enddate
    public String getEndDate(){
        return this.endDate;
    }
    public void setEndDate(String endDate){
        this.endDate= endDate;
    }


}