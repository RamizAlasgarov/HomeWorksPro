package myExaple.functionalInterface.predicateExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ok");
        stringList.add("privet");
        stringList.add("poka");
        stringList.removeIf(s-> s.length()<3);
        System.out.println(stringList);


    }
}
