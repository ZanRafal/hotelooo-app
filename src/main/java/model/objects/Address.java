package model.objects;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class Address {
    private String country;
    private String city;
    private String postalCode;
    private String streetName;

    public Address() {
    }
}
