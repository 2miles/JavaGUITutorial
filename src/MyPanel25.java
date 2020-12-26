import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel25 extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image image;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    public MyPanel25() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        image = new ImageIcon("mwLogo.png").getImage();

        timer = new Timer(10, this);
        timer.start();


    }

    public void paint(Graphics g) {
        super.paint(g);  //paint background
        Graphics g2D = (Graphics) g;
        g2D.drawImage(image,x, y, null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH - image.getWidth(null) || x < 0)
            xVelocity *= -1;
        x = x + xVelocity;

        if(y >= PANEL_HEIGHT - image.getHeight(null) || y < 0)
            yVelocity *= -1;
        y = y + yVelocity;
        repaint();

    }
}
