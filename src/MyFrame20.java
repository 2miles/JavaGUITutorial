import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame20 extends JFrame implements KeyListener {


    JLabel label;
    ImageIcon icon;

   public MyFrame20() {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(500,500);
       this.setLayout(null);
       this.addKeyListener(this);

       icon = new ImageIcon("mwLogo.png");
       label = new JLabel();
       label.setBounds(0, 0, 100, 100);
       //label.setBackground( Color.RED);
       label.setIcon(icon);
       label.setOpaque(true);


       this.getContentPane().setBackground(Color.BLACK);
       this.add(label);
       this.setVisible(true);
   }


    @Override
    public void keyTyped(KeyEvent e) {
       //keyTyped:   Invoked when a key is typed. Uses keyChar, char output
        switch(e.getKeyChar()) {
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;


        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed: Invoked when a physical key is pressed down, used KeyCode, int input
        switch (e.getKeyCode()) {
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       //KeyReleased: Invoked whenever a button is released
        System.out.println("You released the Key Char: " + e.getKeyChar());
        System.out.println("You released the Key Code: " + e.getKeyCode());

    }
}
