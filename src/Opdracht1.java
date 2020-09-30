import java.awt.*;
import java.applet.*;


public class Opdracht1  extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 0; teller <= 10; teller++) {
            y += 20;
            g.drawLine(50, y, 200, y);
        }
    }

}