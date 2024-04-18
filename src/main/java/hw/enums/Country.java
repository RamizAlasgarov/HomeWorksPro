package hw.enums;

public enum Country {
    USA (1),
    GERMANY(2),
    RUSSIA(3);
    int ordinal;

    Country(int ordinal) {
        this.ordinal = ordinal;
    }
}
