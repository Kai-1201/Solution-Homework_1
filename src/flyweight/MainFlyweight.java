package flyweight;

import java.util.ArrayList;
import java.util.List;

public class MainFlyweight {
    public static void main(String[] args) {
        List<Marker> markers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            String style = i % 3 == 0 ? "style1" : i % 3 == 1 ? "style2" : "style3";
            markers.add(new Marker(50.450 + i*0.001, 30.523 + i*0.001,
                    "Hospital " + i, "hospital", "red", style));
        }

        for (int i = 0; i < 1000; i++) {
            String style = i % 2 == 0 ? "styleA" : "styleB";
            markers.add(new Marker(50.450 + i* 0.001, 30.523 + i*0.001,
                    "Restaurant " + i, "restaurant", "blue", style));
        }

        markers.get(0).display();
        markers.get(1000).display();
        markers.get(500).display();
        markers.get(1500).display();

        System.out.println();
        System.out.println("Total markers: " + markers.size());
        System.out.println("Unique styles: " + MarkerStyleFactory.getStyleCount());


    }
}
