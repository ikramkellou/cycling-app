public class Client {
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String mail;
    private String phone;

    public Client (String id,String firstName,String lastName,String address, String mail, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address =  address;
        this.mail =  mail;
        this.phone= phone;
    }

    //  id
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    // firstname
    public String getFirstname() {
        return this.firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    // Lastname
    public String getLastname() {
        return this.lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName ;
    }

    //address
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address ;
    }

    //mail
    public String getMail() {
    return this.address;
    }

    public void setMail(String mail) {
    this.mail = mail ;
    }
    //PHONE
    public String getPhone() {
        return this.phone;
        }
    
        public void setPhone(String phone) {
        this.phone = phone;
        }
}

