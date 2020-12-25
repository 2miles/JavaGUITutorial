import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class MyPanel extends JPanel {

    Image image;

    public MyPanel() {
        this.setPreferredSize(new Dimension(500,500));

        image = new ImageIcon("mwLogo.png").getImage();

    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.BLUE);

        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0,0,500,500);

        g2D.setPaint(Color.PINK);
        g2D.drawRect(0,0, 100, 200);
        g2D.fillRect(0,0,100,200);

        g2D.setPaint(Color.ORANGE);
        g2D.drawOval(0,0,100,100);
        g2D.fillOval(0,0,100,100);

        g2D.setPaint(Color.RED);
        g2D.drawArc(400,200,100,100, 0, 180);
        g2D.setPaint(Color.WHITE);
        g2D.fillArc(300,200,100,100, 0, 180);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};
        g2D.setPaint(Color.YELLOW);
        g2D.drawPolygon(xPoints, yPoints, 3);
        g2D.fillPolygon(xPoints, yPoints, 3);

        g2D.setPaint(Color.MAGENTA);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("U are a bro", 50,350);

        g2D.drawImage(image, 280, 280, null);
    }
}
