package composite;

public class Circle implements Figure {
    @Override
    public void draw(String color) {
        System.out.println(color + " circle");
    }
}
