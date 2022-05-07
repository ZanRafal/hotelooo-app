package model.objects;

public class Contact {
    private final String phoneNumber;
    private final String fax;
    private final String email;
    private final String nip;
    private final String regon;

    private Contact(ContactBuilder contactBuilder) {
        this.phoneNumber = contactBuilder.phoneNumber;
        this.fax = contactBuilder.fax;
        this.email = contactBuilder.email;
        this.nip = contactBuilder.nip;
        this.regon = contactBuilder.regon;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getNip() {
        return nip;
    }

    public String getRegon() {
        return regon;
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

    public static class ContactBuilder {
        private String phoneNumber;
        private String fax;
        private String email;
        private String nip;
        private String regon;


        public ContactBuilder() {}

        public ContactBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ContactBuilder setFax(String fax) {
            this.fax = fax;
            return this;
        }

        public ContactBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public ContactBuilder setNip(String nip) {
            this.nip = nip;
            return this;
        }

        public ContactBuilder setRegon(String regon) {
            this.regon = regon;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }


}
