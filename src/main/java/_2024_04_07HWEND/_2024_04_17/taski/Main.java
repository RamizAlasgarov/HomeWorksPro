package _2024_04_07HWEND._2024_04_17.taski;

import _2024_04_07HWEND._2024_04_17.taski.withHashMap.MapTask;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(FigureGenerator.generateFigures());
        List<Figure> list = FigureGenerator.generateFigures();
//        System.out.println(FigureTasks.findRectangleWithMaxArea(list));
//        System.out.println(FigureTasks.countTrianglesWithSideGreaterThan(list,23));
//        System.out.println(FigureTasks.findCirclesWithRadiusEqualToTriangleSide(list));
//        System.out.println(MapTask.countCirclesOfColor(list));
//        System.out.println(MapTask.sumOfRadiiForColor(list));
//        System.out.println(MapTask.hasRectangleAndTriangleOfSameColor(list));
        System.out.println(MapTask.findRectangleWithLargestDiagonalToPerimeterRatio(list));

    }
}



//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//class Rectangle extends Figure {
//    private Color color;
//    private int a;
//    private int b;
//
//}




