import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkH11 extends Applet{
    Button knop;
    TextField tekstvak;
    Label label;
    int cijfer;

    public void init() {
        label = new Label("voer een getal in het vak");

        tekstvak = new TextField();
        tekstvak.addActionListener(new Listener());

        knop = new Button("OK");
        knop.addActionListener(new Listener());

        add( label );
        add( tekstvak );
        add( knop );

    }
    public void paint(Graphics g){
        setBackground(Color.lightGray);
        int teller;
        int antwoord;
        int y = 40;

        for(teller = 1; teller <=10; teller++){
            antwoord = cijfer * teller;
            y += 20;
            g.drawString(""+ cijfer + "x" + teller + "= "+ antwoord,40,y);
        }
    }
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = tekstvak.getText();
            cijfer = Integer.parseInt(output);
            repaint();

        }
    }


}