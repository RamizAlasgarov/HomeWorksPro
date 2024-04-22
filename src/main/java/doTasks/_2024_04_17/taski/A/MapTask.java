package doTasks._2024_04_17.taski.A;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public static Map<Color, Integer> sumOfRadiiForColor(List<Figure> figures) {
        Map<Color, Integer> radiusSum = new HashMap<>();

        return radiusSum;
    }

    //Find the rectangle with the largest diagonal to perimeter ratio:
    public static Map<Rectangle, Double> findRectangleWithLargestDiagonalToPerimeterRatio(List<Figure> figures) {
        Map<Rectangle, Double> rectangleRatios = new HashMap<>();

        return rectangleRatios;
    }

    //Find circles with radius equal to any triangle side:
    public static Map<Circle, Boolean> findCirclesWithRadiusEqualToTriangleSide(List<Figure> figures) {
        return null;
    }

    //Determine if there's a rectangle and triangle of the same color:
    public static Map<String, Boolean> hasRectangleAndTriangleOfSameColor(List<Figure> figures) {

        return null;
    }

}
