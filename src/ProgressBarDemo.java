import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    private JFrame frame = new JFrame();
    private JProgressBar bar = new JProgressBar(0,500);

    public ProgressBarDemo() {

        bar.setValue(0); //set the initial value
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true); //adds a percentage to the progress bar
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill() {
        int counter = 0;

        while(counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50); //pause the program for 1000 millacecons
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1;
        }
        bar.setString("Done! ");

    }
}
