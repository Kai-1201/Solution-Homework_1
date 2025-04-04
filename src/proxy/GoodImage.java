package proxy;

public class GoodImage  implements Image {
    private String filename;
    private String thumbnail;
    private String highResImage;

    public GoodImage(String filename) {
        this.filename = filename;
        loadThumbnail();
    }
    private void loadThumbnail() {
        System.out.println("Uploading thumbnail for " + filename);
        this.thumbnail = "Thumbnail: " + filename;
    }

    private void loadHighResImage() {
        System.out.println("Loading high resolution image for " + filename);
        this.highResImage = "High Resolution: " + filename;
    }

    @Override
    public void display() {
        System.out.println(thumbnail);
    }

    @Override
    public void displayFullImage() {
        if (highResImage == null) {
            loadHighResImage();
        }
        System.out.println(highResImage);
    }
}
