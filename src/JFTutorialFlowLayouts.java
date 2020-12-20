import javax.swing.*;
import java.awt.*;

public class JFTutorialFlowLayouts {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20,10)); //stay to the center, with spacing between components as given
        //frame.setLayout(new FlowLayout(FlowLayout.LEADING)); //stay to the left side
        //frame.setLayout(new FlowLayout(FlowLayout.TRAILING)); //stay to the right side

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout()); //this is also by default for panels


        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
