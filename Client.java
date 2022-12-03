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

    private void formatId() {
        int length = this.id.length();
        for (int i = 0; i < 10 - length; i++) {
            this.id = "0" + this.id;
        }
    }

    // firstName
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void formatFirstName() {
        int length = this.firstName.length();
        for (int i = 0; i < 30 - length; i++) {
            this.firstName = " " + this.firstName;
        }
    }

    // lastname
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void formatLastName() {
        int length = this.lastName.length();
        for (int i = 0; i < 30 - length; i++) {
            this.lastName = " " + this.lastName;
        }
    }

    // address
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void formatAddress() {
        int length = this.address.length();
        for (int i = 0; i < 35 - length; i++) {
            this.address = " " + this.address;
        }
    }

    // mail
    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    private void formatMail() {
        int length = this.mail.length();
        for (int i = 0; i < 15 - length; i++) {
            this.mail = " " + this.mail;
        }
    }

    // phone
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private void formatPhone() {
        int length = this.phone.length();
        for (int i = 0; i < 10 - length; i++) {
            this.phone = " " + this.phone;
        }
    }

    // methods
    public void formatValues() {
        this.formatId();
        this.formatFirstName();
        this.formatLastName();
        this.formatAddress();
        this.formatMail();
        this.formatPhone();
    }

    public String getClientAsLine() {
        return getId() + "," + getFirstName() + "," + getLastName() + "," + getAddress() + "," + getMail() + ","
                + getPhone() + "\n";
    }
}
