import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("This is the title"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);  //makes the frame visible

        ImageIcon image = new ImageIcon("mwLogo.png"); //create an imageIcon
        this.setIconImage(image.getImage());  //change icon of frame

        //frame.getContentPane().setBackground(Color.CYAN); //change color of background
        this.getContentPane().setBackground(new Color(200,210,90)); //change color of background

    }
}
