package model.objects;

public enum Occupancy {
    OCCUPIED,
    AVAILABLE;

    public String getValue() {
        return switch (this) {
            case OCCUPIED -> "Hotel zarezerwowany";
            case AVAILABLE -> "Hotel dostępny";
        };
    }
}
