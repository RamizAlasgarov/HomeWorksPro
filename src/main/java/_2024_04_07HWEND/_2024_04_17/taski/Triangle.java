package _2024_04_07HWEND._2024_04_17.taski;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Triangle extends Figure{
    private Color color;
    private int a;
    private int b;
    private int c;

}
