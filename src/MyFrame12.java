import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame12 extends JFrame implements ActionListener {

    private JButton button;
    private JCheckBox checkBox;

    private ImageIcon xIcon;
    private ImageIcon checkIcon;

    MyFrame12() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //xIcon = new ImageIcon("x.png");  //for adding a custom chechbox icon;
        //checkIcon = new ImageIcon("checkmark.png");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I am very cool");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        //checkBox.setIcon(xIcon);  //change the inselected checkboc icon
        //checkBox.setSelectedIcon(checkIcon); //change the selected checkbox icon


        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
