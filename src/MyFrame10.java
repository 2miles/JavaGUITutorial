import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame10 extends JFrame implements ActionListener {

    private JButton button;
    private JTextField textField;

    public MyFrame10() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField= new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0x00FF00));//bright green
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("Username");

        this.add(button);
        this.add(textField);
        this.pack();  //the size of the frame adjusts to fit the components we have
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Welcome " + textField.getText());

            textField.setEditable(false); //we can no longer edit the textField
            button.setEnabled(false);  //we can no longer use the button
            System.out.println(textField.getText());
        }

    }
}
