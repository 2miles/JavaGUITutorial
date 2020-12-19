import javax.swing.*;
import java.awt.*;


public class JFrameTutorialPanels {

    public static void main(String[] args) {

        //JPanel = a GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("mwLogo.png");

        JLabel label = new JLabel();
        label.setText("waddup");
        label.setIcon(icon);

        //this is for the border layout
        //
        //label.setVerticalAlignment(JLabel.TOP);
        //label.setHorizontalAlignment(JLabel.CENTER);
        //sets the x,y,w,h label relative to whichever ocntainer its in
        label.setBounds(0, 50, 300, 300); //needed becuse we have setLayout(null)

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0, 500, 500);
        //redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(500,0, 500, 500);
        //bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,500, 1000, 500);
        //greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1500, 1500);
        frame.setVisible(true);

        greenPanel.add(label);

        frame.add(redPanel);  //add the panel to the fame
        frame.add(bluePanel);  //add the panel to the fame
        frame.add(greenPanel);  //add the panel to the fame

    }
}
