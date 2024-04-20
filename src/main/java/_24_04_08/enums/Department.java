package _24_04_08.enums;

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
