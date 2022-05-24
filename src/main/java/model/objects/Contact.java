package model.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public class Contact {
    private String phoneNumber;
    private String email;

    public static final Contact NULL_CONTACT = new Contact();

    public Contact() {
        this("", "");
    }
}

