package singleton;

public class Singleton {
    public static Singleton instance = new Singleton();
    private Singleton() {}
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
