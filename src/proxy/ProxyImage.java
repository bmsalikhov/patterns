package proxy;

public class ProxyImage implements Image {
    private String filePath;
    private RealImage image;

    public ProxyImage(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(filePath);
        }
        image.display();
    }
}
