import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    public void init() {}

    public void paint(Graphics g){
        int teller;
        int height = 10;
        int width = 10;
        int x = 50;
        int y = 50;


        for(teller = 0; teller <= 4; teller++) {
            g.drawOval(x,y,width,height);
            height += 10;
            width += 10;
            x -= 5;
            y -= 5;

        }



    }
}