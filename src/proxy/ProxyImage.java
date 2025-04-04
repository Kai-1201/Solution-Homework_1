package proxy;


public class ProxyImage {
    private GoodImage realImage;
    private String filename;
    private boolean isAgent;

    public ProxyImage(String filename, boolean isAgent) {
        this.filename = filename;
        this.isAgent = isAgent;
    }
}
