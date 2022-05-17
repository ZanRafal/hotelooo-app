package model.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class Contact {
    private String phoneNumber;
    private String email;

    public Contact() {
    }
}
