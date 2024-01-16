package composite;

import java.util.ArrayList;

public class CompositeFigure implements Figure {
    ArrayList<Figure> figures = new ArrayList<>();
    @Override
    public void draw(String color) {
        for (Figure f : figures) {
            f.draw(color);
        }
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public void clear() {
        figures.clear();
    }
}
