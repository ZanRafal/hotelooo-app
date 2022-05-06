package model.objects;

public class Contact {
    private String phoneNumber;
    private String fax;
    private String email;
    private String nip;
    private String regon;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", nip='" + nip + '\'' +
                ", regon='" + regon + '\'' +
                '}';
    }
}
