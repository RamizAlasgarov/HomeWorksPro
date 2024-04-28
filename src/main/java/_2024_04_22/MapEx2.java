package _2024_04_22;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("_2024_04_07HWEND/_2024_04_17/taski/withHashMap", "a");
        map.put(null, "b");

        for (String keys : map.keySet()) {
            if("_2024_04_07HWEND/_2024_04_17/taski/withHashMap".equals(keys)) {
                System.out.println("!!!!");
            }
        }
    }
}
