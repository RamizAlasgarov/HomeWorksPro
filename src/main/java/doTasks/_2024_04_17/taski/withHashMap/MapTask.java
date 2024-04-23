package doTasks._2024_04_17.taski.withHashMap;



import java.util.*;

import doTasks._2024_04_17.taski.*;

public class MapTask {
        //Count circles of a given color:
    //Сосчитайте круги заданного цвета:
    public static Map<Color, Integer> countCirclesOfColor(List<Figure> figures) {
        Map<Color, Integer> colorCount = new HashMap<>();
        for (Figure f : figures){
            if(f instanceof Circle){
                Circle circle = (Circle) f;
                Color color = circle.getColor();
                if(colorCount.containsKey(color)){
                    colorCount.put(color,colorCount.get(color)+1);
                }else {
                    colorCount.put(color,1);
                }
            }
        }
        return colorCount;
        /**
         * Map<Color, Integer> colorCount = new HashMap<>();
         *     for (Figure figure : figures) {
         *         if (figure instanceof Circle) {
         *             Circle circle = (Circle) figure;
         *             colorCount.put(circle.getColor(), colorCount.getOrDefault(circle.getColor(), 0) + 1);
         *         }
         *     }
         *     return colorCount;
         */
    }

    //Sum of radii for circles of a certain color:
    //Сумма радиусов для окружностей определенного цвета:
    public static Map<Color, Integer> sumOfRadiiForColor(List<Figure> figures) {
        Color color = Color.BLACK;
        Map<Color, Integer> radiusSum = new HashMap<>();

        for (Figure figure : figures) {
            if(figure instanceof Circle){

                Circle circle = (Circle) figure;
                int sum = circle.getRadius();
                if(circle.getColor().equals(color)){
                    radiusSum.put(circle.getColor(),sum);
                }
            }
        }
        return radiusSum;
    }

    //Find the rectangle with the largest diagonal to perimeter ratio:
    /**
     Найдите прямоугольник с наибольшим отношением диагонали к периметру:
     */
    public static Map<Rectangle, Double> findRectangleWithLargestDiagonalToPerimeterRatio(List<Figure> figures) {
        Map<Rectangle, Double> rectangleRatios = new HashMap<>();

        return rectangleRatios;
    }

    //Find circles with radius equal to any triangle side:
    //Найдите окружности, радиус которых равен любой стороне треугольника:
    public static Map<Circle, Triangle> findCirclesWithRadiusEqualToTriangleSide(List<Figure> figures) {
        Map<Circle, Triangle> result = new HashMap<>();
        List<Circle> circles = new ArrayList<>();
        List<Triangle> triangles = new ArrayList<>();

        for (Figure figure : figures) {
            if (figure instanceof Circle) {
                circles.add((Circle) figure);
            }

            if (figure instanceof Triangle) {
                triangles.add((Triangle) figure);
            }
        }

        for (Circle circle : circles) {
            for (Triangle triangle : triangles) {
                int a = triangle.getA();
                int b = triangle.getB();
                int c = triangle.getC();

                int radius = circle.getRadius();

                if(radius == a || radius == b || radius == c){
                    result.put(circle, triangle);
//                } else {
//                    result.put(circle, false);
                }
            }
        }
        System.out.println(result.size());
        return result;
    }



    //Determine if there's a rectangle and triangle of the same color:
    //Определите, есть ли прямоугольник и треугольник одного цвета
    public static Map<String, Boolean> hasRectangleAndTriangleOfSameColor(List<Figure> figures) {
        Map<String,Boolean> sameColor = new HashMap<>();
        for (Figure figure : figures) {
            if(figure instanceof Rectangle ){
                Rectangle rectangle = (Rectangle) figure;
                String color = String.valueOf(rectangle.getColor());
                boolean a = sameColor.getOrDefault(color,false);
                boolean b = sameColor.getOrDefault(color,false);

                if(a && b ){
                    continue;
                }
                if (figure instanceof Rectangle) {
                    sameColor.put(color, true);
            }
                if (figure instanceof Triangle) {
                    sameColor.put(color, true);
                }
        }
    }
        return sameColor;
}
}
