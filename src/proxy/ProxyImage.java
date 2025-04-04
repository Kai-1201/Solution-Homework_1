package proxy;


public class ProxyImage implements Image {
    private GoodImage realImage;
    private String filename;
    private boolean isAgent;

    public ProxyImage(String filename, boolean isAgent) {
        this.filename = filename;
        this.isAgent = isAgent;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new GoodImage(filename);
        }
        realImage.display();
    }

    @Override
    public void displayFullImage() {
        if (!isAgent) {
            System.out.println("Error: Only agents can view high resolution images");
            return;
        }
        if (realImage == null) {
                realImage = new GoodImage(filename);
        }
        realImage.displayFullImage();
    }
}
