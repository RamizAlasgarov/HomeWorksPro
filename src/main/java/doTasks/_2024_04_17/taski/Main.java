package doTasks._2024_04_17.taski;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(FigureGenerator.generateFigures());
        List<Figure> list = FigureGenerator.generateFigures();
//        System.out.println(FigureTasks.findRectangleWithMaxArea(list));
//        System.out.println(FigureTasks.countTrianglesWithSideGreaterThan(list,23));

    }
}

@ToString
class Figure {

}

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
class Rectangle extends Figure {
    private Color color;
    private int a;
    private int b;

}

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
class Triangle extends Figure {
    private Color color;
    private int a;
    private int b;
    private int c;

}

@ToString
@AllArgsConstructor
class Circle extends Figure {
    private Color color;
    private int radius;

    public Color getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }
}

@ToString
enum Color {
    RED, BLACK, WHITE, BLUE, GREEN, YELLOW, ORANGE, PINK, PURPLE, MULTICOLOR
}
