package composite;

public class CompositeMain {
    public static void main(String[] args) {
        CompositeFigure triangle = new CompositeFigure();
        triangle.add(new Line());
        triangle.add(new Line());
        triangle.add(new Line());
        triangle.draw("red");
    }
}
