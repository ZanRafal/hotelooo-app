package model.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
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
