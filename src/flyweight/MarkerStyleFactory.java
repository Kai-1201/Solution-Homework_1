package flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getMarkerStyle(String iconType, String color, String labelStyle) {
        String key = iconType + "_" + color + "_" + labelStyle;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(iconType, color, labelStyle));
        }
        return styles.get(key);
    }
    public static int getStyleCount() {
        return styles.size();
    }
}
