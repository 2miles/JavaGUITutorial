import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameWithButton extends JFrame implements ActionListener {

    private JButton button;
    private JLabel label;

    FrameWithButton() {

        ImageIcon icon = new ImageIcon("mwLogo.png");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150,  550, 250, 200);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 400, 400);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 800);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button) {
            //System.out.println("no ice");
            //button.setEnabled(false);  //makes button unable to be pressed after its pressed once
            label.setVisible(true);
        }
    }
}
