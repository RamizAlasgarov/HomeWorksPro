package _2024_04_26;

import java.util.*;


public class Task {
    public static void main(String[] args) {

            Map<String, List<Double>> nameToMarks = Map.of(
                    "Tom", new ArrayList<>(),
                    "Jerry", Arrays.asList(5.0,5.0)
//                "Ban", List.of(4.0,4.0),
//                "Max", List.of(3.0,3.0),
//                "Alex", List.of(0.0,0.0)
            );
            System.out.println(getAverageMark(nameToMarks));


    }
    /**
     * 2 Напишите метод, который принимает на вход строку и возвращает набор уникальных слов из этой строки.
     */
    private static Set<String> unigue(String words){
        return new HashSet<>(Arrays.asList(words.split(" ")));
    }


    /**
     * Создайте программу для учета оценок студентов.
     * Используйте коллекцию Map, где ключ - это имя студента,
     * а значение - список его оценок. Реализуйте метод для подсчета средней оценки каждого студента.
     */
    private static Map<String, Double> getAverageMark (Map<String, List<Double>> nameToMarks) {
        Map<String, Double> nameToAverage = new HashMap<>();
        for (Map.Entry<String, List<Double>> e : nameToMarks.entrySet()) {
            double average = 0;
            for (Double m : e.getValue()) {
                average += m;
            }
//            if(!e.getValue().isEmpty()){
//                average/= e.getValue().size();
//            }
            average = !e.getValue().isEmpty() ?  average/e.getValue().size() : 0;
            nameToAverage.put(e.getKey(), average);
        }
        return nameToAverage;
    }

}
