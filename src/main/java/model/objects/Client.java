package model.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class Client {
    private String firstName;
    private String lastName;
    private Contact contact;

    public static final Client NULL_CLIENT = new Client();

    public Client() {
        this("", "", Contact.NULL_CONTACT);
    }
}
