import javax.swing.*;
import java.awt.*;

public class MyFrame24 extends JFrame {

    MyPanel panel;

    public MyFrame24() {

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    //use graphis 2d


}
