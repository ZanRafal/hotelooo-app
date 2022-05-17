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

    public Client() {
    }
}
