import proxy.Image;
import proxy.ProxyImage;

public class Main {
    public static void main(String[] args) {
        Image agentImage1 = new ProxyImage("beach_house.jpg", true);

        Image userImage1 = new ProxyImage("beach_house.jpg", false);

        System.out.println("Agent View: ");
        agentImage1.display();
        agentImage1.displayFullImage();

        System.out.println();
        System.out.println("User View: ");
        userImage1.display();
        userImage1.displayFullImage();

    }
}