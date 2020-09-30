import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void paint(Graphics g) {
        setBackground(Color.lightGray);

        int teller;
        int x = 40;
        int y = 40;

        for(teller = 0; teller <= 4; teller++) {

            g.drawRect(x, y, 20, 20);
            x += 20;
            y += 20;


        }
    }
}