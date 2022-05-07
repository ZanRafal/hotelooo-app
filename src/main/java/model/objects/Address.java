package model.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String country;
    private String city;
    private String postalCode;
    private String streetName;
}
