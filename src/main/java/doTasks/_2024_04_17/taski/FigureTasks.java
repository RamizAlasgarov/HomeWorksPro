package doTasks._2024_04_17.taski;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class FigureTasks {

    // ****************** Basic Tasks ******************

    /**
     * 1. Напишите метод для подсчета всех кругов заданного цвета в списке фигур.
     */
    public static int countCirclesOfColor(List<Figure> figures, Color color) {
        int count = 0;
        for(Figure f: figures){
            if(f instanceof Circle){
                Circle circle = (Circle) f;
                if(circle.getColor().equals(color)){
                    count++;

                }
            }
        }
      return count;
    }

    /**
     * 2. Напишите метод для нахождения прямоугольника с максимальной площадью.
     */
    public static Rectangle findRectangleWithMaxArea(List<Figure> figures) {
        int max = 0;
        Rectangle rectangle = null;
        for(Figure f : figures){
            if(f instanceof Rectangle){
                Rectangle r = (Rectangle) f;
                int square = r.getA()*r.getB();
                if(square > max){
                    max =square;
                    rectangle = r;
                }
            }
        }
        return rectangle;
    }

    /**
     * 3. Напишите метод для вывода всех треугольников, у которых все стороны равны.
     */
    public static void printEquilateralTriangles(List<Figure> figures) {
        for(Figure f : figures){
            if(f instanceof Triangle){
               Triangle triangle = (Triangle) f;
               if(checkTriangle(triangle)){
                   System.out.println(triangle);
               }
             }
        }
    }
    public static boolean checkTriangle(Triangle triangle){
        return triangle.getA() == triangle.getB() && triangle.getB() == triangle.getC();
    }

    /**
     * 4. Напишите метод для нахождения суммы радиусов всех кругов определенного цвета.
     */
    public static int sumOfRadiiForColor(List<Figure> figures, Color color) {
        int sumRadius=0;
        for (Figure figure:figures){
            if (figure instanceof Circle&&((Circle) figure).getColor()==color){
                Circle circle=(Circle) figure;
                sumRadius+=circle.getRadius();
            }
        }
        return sumRadius;
    }

    /**
     * 5. Напишите метод для определения, есть ли в списке фигур прямоугольник и треугольник одинакового цвета.
     */
    public static boolean hasRectangleAndTriangleOfSameColor(List<Figure> figures) {
//        List<String> colorRectangle = new ArrayList<>();
//        Triangle triangle = null;
//        Rectangle rectangle = null;
//        boolean isHaveSameColor = false;
//        for (Figure figure : figures) {
//            if (figure instanceof Rectangle) { //
//                colorRectangle.add(((Rectangle) figure).getColor());
//            }
//            for (Figure f1 : figures) {
//                if (f1 instanceof Triangle) {
//                    triangle = (Triangle) figure;
//                }
//            }
//            if (figure instanceof Triangle) {
//                triangle = (Triangle) figure;
//            }
//        }
        return false;
    }


        /**
         * public static boolean hasRectangleAndTriangleOfSameColor(List<Figure> figures) {
         *     boolean Rectangle = false;
         *     boolean Triangle = false;
         *     Color rectangleColor = null;
         *     Color triangleColor = null;
         *             for (Figure figure : figures) {
         *         if (figure instanceof Rectangle) {
         *             Rectangle = true;
         *             rectangleColor = figure.getColor();
         *         } else if (figure instanceof Triangle) {
         *             Triangle = true;
         *             triangleColor = figure.getColor();
         *         }
         *     }
         *     return Rectangle && Triangle && rectangleColor.equals(triangleColor);
         * }
         */


    // ****************** Intermediate Tasks ******************

    /**
     * 6. Напишите метод для нахождения круга с минимальным радиусом среди кругов заданного цвета.
     */
    public static Circle findCircleWithMinRadiusOfColor(List<Figure> figures, Color color) {
        Circle circle1 = null;
        for (Figure f : figures) {
            if (f instanceof Circle) {
                Circle circle = (Circle) f;
                if (circle.getRadius() < circle.getRadius() && circle.getColor().equals(color)) {
                    circle1 = circle;
                }
            }
            return circle1;
        }
        return null;
    }




    /**
     * 7. Напишите метод для подсчета треугольников, у которых хотя бы одна сторона больше заданного значения.
     */
    public static int countTrianglesWithSideGreaterThan(List<Figure> figures,int length) {
        int count = 0;
        for (Figure figure : figures){
            if(figure instanceof Triangle){
                Triangle triangle = (Triangle) figure;
                if(length > triangle.getA() || length > triangle.getB() || length > triangle.getC()){
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 9. Напишите метод для нахождения всех кругов, у которых радиус равен любой из сторон любого треугольника.
     */
    public static List<Circle> findCirclesWithRadiusEqualToTriangleSide(List<Figure> figures) {
//        boolean triangle = false;
//        Triangle trianglefirstSide = null;
//        Triangle triangleSecondSide = null;
//        Triangle triangleThirdSide = null;
        List<Integer> circleList = new ArrayList<>();
        List<Integer> triangleList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        for (Figure figure : figures) {
            if(figure instanceof Circle){
                circleList.add(((Circle) figure).getRadius());
            }else if(figure instanceof Triangle){
//                triangle = true;
//                trianglefirstSide.getA();
            }
        }
        System.out.println(circleList);
        for (Figure figure : figures) {
            if(figure instanceof Triangle){

                triangleList.add(((Triangle) figure).getA()+ ((Triangle) figure).getB()+((Triangle) figure).getC());
            }
        }
        System.out.println(triangleList);
        for (int i = 0; i < circleList.size(); i++) {
            for (int j = 0; j < triangleList.size(); j++) {
                if(circleList.get(i).equals(triangleList.get(j))){
                    resultList.add(circleList.get(i));
                }
            }
        }
        System.out.println(resultList);
//        List<Integer> list = new ArrayList<>();
//        for (Figure figure : figures) {
//            if(figure instanceof Circle){
//                list.add(((Circle) figure).getRadius());
//            }
//        }
//        List<Circle> circles = new ArrayList<>();
//        for (Figure figure : figures){
//            if(figure instanceof Triangle){
//                   Triangle triangle = (Triangle) figure;
//                   if((triangle.getA() ||triangle.getB() || triangle.getC()) > m(circles))
//            }
//        }
        return null;
    }

    // ****************** Upper Intermediate Tasks ******************

    /**
     * 11. Напишите метод для нахождения треугольника, у которого разница между
     * максимальной и минимальной сторонами минимальна среди всех треугольников.
     */
    public static Triangle findTriangleWithSmallestSideDifference(List<Figure> figures) {
        return null;
    }

    /**
     * 12. Напишите метод для вывода всех фигур, у которых хотя бы один параметр
     * (цвет, радиус, сторона) совпадает с аналогичным параметром другой фигуры.
     */
    public static void printFiguresWithAtLeastOneMatchingParameter(List<Figure> figures) {
    }

    // Helper method to determine if two figures have at least one matching parameter
    private static boolean figuresMatch(Figure a, Figure b) {
        if(a instanceof Triangle){

        }
        return false;
    }

    /**
     * 13. Напишите метод для нахождения кругов, у которых радиус больше суммы сторон любого треугольника в списке.
     */
    public static List<Circle> findCirclesWithRadiusGreaterThanSumOfAnyTriangleSides(List<Figure> figures) {
        List<Integer> circles = new ArrayList<>();
        List<Integer> sumOfTriangle = new ArrayList<>();
        List<Integer> circleList = new ArrayList<>();
        for (Figure f : figures){
            if(f instanceof Triangle){
                sumOfTriangle.add(((Triangle) f).getA()+ ((Triangle) f).getB()+((Triangle) f).getC());
            }
        }
        for (Figure figure : figures) {
            if(figure instanceof Circle){
                circles.add(((Circle) figure).getRadius());
            }
        }
        for (int i = 0; i < circles.size(); i++) {
            for (int j = 0; j < sumOfTriangle.size(); j++) {
                if(circles.get(i) > sumOfTriangle.get(i)){
                    circleList.add(sumOfTriangle.get(i));
                }
            }
        }
        return null;
    }

    // ****************** Advanced Tasks ******************

    /**
     * 16. Напишите метод для нахождения круга, который можно вписать в
     * наибольшее количество треугольников, учитывая их углы и стороны.
     */
    public static Circle findCircleThatFitsMostTriangles(List<Figure> figures) {
        return null;
    }


    /**
     * 19. Напишите метод для определения треугольника с наименьшим углом, вписывающимся в заданный круг.
     */
    public static Triangle findSmallestAngleTriangleInCircle(Circle circle, List<Figure> figures) {
        return null;
    }

    // ****************** Expert Tasks ******************

    /**
     * 21. Напишите метод для определения круга,
     * у которого соотношение площади к радиусу является наименьшим среди всех кругов.
     */
    public static Circle findCircleWithSmallestAreaToRadiusRatio(List<Figure> figures) {
        return null;
    }

    /**
     * 23. Напишите метод для определения, можно ли составить из треугольников полигон без промежутков и наружных выступов.
     */
    public static boolean canFormClosedPolygonFromTriangles(List<Figure> figures) {
        return true;
    }

    /**
     * 24. Напишите метод для определения прямоугольника с наибольшим отношением диагонали к периметру.
     */
    public static Rectangle findRectangleWithLargestDiagonalToPerimeterRatio(List<Figure> figures) {
        return null;
    }

    /**
     * 25. Напишите метод для нахождения всех комбинаций фигур, 
     * которые могут быть соединены таким образом, чтобы их общая площадь была равна заданному значению.
     */
    public static List<List<Figure>> findFigureCombinationsMatchingArea(List<Figure> figures, int targetArea) {
        return null;
    }

    }