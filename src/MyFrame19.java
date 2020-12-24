import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame19 extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    public MyFrame19() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("This is some sick text");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true); //so we can se the background

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();

            //assign the color they choose with the colorchooser
            //to the Color variable color
            Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);

            //label.setForeground(color);
            label.setBackground(color);
        }

    }
}
