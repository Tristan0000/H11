import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet{

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        int teller;
        int y = 20;

        for(teller = 1; teller <= 10000;) {
            teller += teller;
            g.drawString("" + teller, 40, y);
            y += 20;
        }
    }
}