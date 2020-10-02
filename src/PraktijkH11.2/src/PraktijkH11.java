import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkH11 extends Applet {

    Button knop;
    int getal = 1;

    public void init() {

        knop = new Button("ok");
        knop.addActionListener(new Listener());
        add( knop );

    }
    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        int uitkomst;
        int teller;
        int y = 40;

        for(teller = 1; teller <= 10; teller++) {
            uitkomst = getal * teller;
            y += 20;
            g.drawString(""+ getal + " x " + teller + "= " + uitkomst,40,y);
        }
    }
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (getal < 10) {
                getal++;
            } else {
                getal = 1;
            }
            repaint();
        }
    }
}