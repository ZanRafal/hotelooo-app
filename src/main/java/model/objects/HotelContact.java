package model.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class HotelContact extends Contact {
    private String phoneNumber;
    private String email;
    private String fax;
    private String regon;
    private String nip;

    public HotelContact() {
    }
}
