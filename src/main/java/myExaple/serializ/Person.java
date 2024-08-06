package myExaple.serializ;

import lombok.Data;

import java.io.Serializable;


@Data
public class Person implements Serializable {
    private final String name;
    private final int age;
    private final double salary;
    private final boolean isMarried;

}
