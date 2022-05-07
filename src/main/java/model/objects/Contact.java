package model.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contact {
    private String phoneNumber;
    private String email;
}
