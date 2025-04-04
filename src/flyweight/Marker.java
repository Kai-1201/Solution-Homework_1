package flyweight;

public class Marker {
    private double latitude;
    private double longitude;
    private String label;
    private MarkerStyle style;

    public Marker(double latitude, double longitude, String label,
                  String iconType, String color, String labelStyle) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.label = label;
        this.style = MarkerStyleFactory.getMarkerStyle(iconType, color, labelStyle);
    }

    public void display() {
        style.display(latitude, longitude, label);
    }
}
