package model.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client {
    private String firstName;
    private String lastName;
    private Contact contact;
}
