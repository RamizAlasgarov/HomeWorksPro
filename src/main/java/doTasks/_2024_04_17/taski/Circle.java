package doTasks._2024_04_17.taski;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
public class Circle extends Figure{


        private Color color;
        private int radius;

        public Color getColor() {
            return color;
        }

        public int getRadius() {
            return radius;
        }

}
