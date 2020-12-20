import javax.swing.*;
import java.awt.*;

public class JFTutorialGridLayout {
    public static void main(String [] args) {
        //GridLayout: Placed components in a gris of cells.
        //            Each component takes all the available space
        //            within its cell, and each cell is the same size


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3, 10,20));

        //long way
        //JButton button1 = new JButton("1");

        //short way  //unnamed buttons
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));

        frame.setVisible(true);
        //frames by defautl use a borderLayout manager
        //so the components like to take up as much room as possible

    }
}
