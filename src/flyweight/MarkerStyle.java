package flyweight;

public class MarkerStyle {
    private final String iconType;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }
    public void display(double latitude, double longitude, String label) {
        System.out.printf("Displaying marker [%s, %s, %s] at coordinates (%.4f, %.4f) with label '%s'\n", iconType, color, labelStyle, latitude, longitude, label);
    }
}
