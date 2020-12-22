import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JSlider slider;

    public SliderDemo () {
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100, 50);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        slider.setPaintLabels(true); //number the major ticks
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider.setOrientation(SwingConstants.VERTICAL); //orintation of the slider

        label.setText("Degrees C = " + slider.getValue());
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        slider.addChangeListener(this);
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420, 420);
        frame.setVisible(true);

    }


    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText("Degrees C = " + slider.getValue());
    }
}
