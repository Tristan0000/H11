import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    public void paint(Graphics g) {

        setBackground(Color.lightGray);

        int teller;
        int y = 20;
        int uitkomst = 0;

        for (teller = 0; teller < 11; teller++) {
            uitkomst =3 * teller;
            g.drawString("" + uitkomst,40,y);
            y += 20;

        }
    }
}