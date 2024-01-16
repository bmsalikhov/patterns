package composite;

public class Line implements Figure {
    @Override
    public void draw(String color) {
        System.out.println(color + " line");
    }
}
