public class Client {
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String mail;
    private String phone;

    public Client(String id, String firstName, String lastName, String address, String mail, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
    }

    // Id
    public String getId() {
        return this.id;
    }

    // firstName
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // lastname
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // address
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // mail
    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    // phone
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
