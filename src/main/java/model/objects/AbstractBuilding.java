package model.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public abstract class AbstractBuilding {
    private Integer id;
    private String name;
}
