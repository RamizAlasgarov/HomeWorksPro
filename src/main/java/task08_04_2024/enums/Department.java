package task08_04_2024.enums;

public enum Department {
    ADMINISTRATION("0"),
    HR("1"),
    SALES("2"),
    IT("3");


    String ordinal;

    Department(String ordinal) {
        this.ordinal = ordinal;
    }
}
