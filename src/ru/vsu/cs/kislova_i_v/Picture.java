package ru.vsu.cs.kislova_i_v;

import ru.vsu.cs.kislova_i_v.figures.Circle;
import ru.vsu.cs.kislova_i_v.figures.Line;
import ru.vsu.cs.kislova_i_v.figures.VerticalParabola;

public class Picture {
    public final Circle Circle;
    public final Line Line;
    public final VerticalParabola Parabola;

    public Picture(Circle Circle, Line Line, VerticalParabola Parabola) {
        this.Circle = Circle;
        this.Line = Line;
        this.Parabola = Parabola;
    }

    public SimpleColor getColor(double x, double y) {
        SimpleColor color;

        if ((Circle.isPointInCircle(x, y) && Line.isPointAboveLine(x, y))
                || (Circle.isPointInCircle(x, y) && Parabola.isPointInsideOfVerticalParabola(x, y))) {
            color = SimpleColor.YELLOW;
        } else if ((Parabola.isPointInsideOfVerticalParabola(x, y) && !Circle.isPointInCircle(x, y))
                || (!Parabola.isPointInsideOfVerticalParabola(x, y) && !Line.isPointAboveLine(x, y) && (x > 5))
                || (Circle.isPointInCircle(x, y) && Line.isPointAboveLine(x, y))) {
            color = SimpleColor.BLUE;
        } else if (!Circle.isPointInCircle(x, y) && !Parabola.isPointInsideOfVerticalParabola(x, y)
                && Line.isPointAboveLine(x, y)) {
            color = SimpleColor.ORANGE;
        } else {
            color = SimpleColor.GREY;
        }

        return color;
    }
}
