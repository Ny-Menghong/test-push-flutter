import java.awt.*;
import javax.swing.*;

public class SimpleApplet extends JApplet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        setBackground(Color.green);

        g.drawString("Java makes applets easy.", 20, 20);

        g.setFont(new Font("Limon S1", Font.PLAIN, 48));
        g.drawString("snøwkebo", 20, 70);
    }
}