import java.awt.*;
import java.applet.*;

public class Opdracht8 extends Applet {

    public void init() {}

    public void paint(Graphics g){
        int teller;
        int height = 10;
        int width = 10;
        int x = 800;
        int y = 400;
        int kleurenteller = 1;

        for(teller = 0; teller <= 100; teller++) {

            switch (kleurenteller) {
                case 1:
                    g.setColor(Color. blue);
                    ++kleurenteller;
                    break;

                case 2:
                    g.setColor(Color.green);
                    ++kleurenteller;
                    break;

                case 3:
                    g.setColor(Color.orange);
                    kleurenteller = 1;
                    break;
            }

            g.drawOval(x,y,width,height);
            height += 10;
            width += 10;
            x -= 3;
            y -= 4;
        }



    }
}