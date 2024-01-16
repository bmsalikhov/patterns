package prototype;

public class ComplicatedObject implements Copyable {

    Type type;
    @Override
    public ComplicatedObject copy() {
        return new ComplicatedObject();
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        ONE,
        TWO
    }
}
