package model.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HotelContact extends Contact {
    private String fax;
    private String regon;
    private String nip;

    public HotelContact(String phoneNumber, String email, String fax, String regon, String nip) {
        super(phoneNumber, email);
        this.fax = fax;
        this.regon = regon;
        this.nip = nip;
    }
}
