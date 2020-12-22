import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame14 extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame14() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setBounds(100,100, 300, 100);

        //option list MUST be an array of reference types (objects)
        //if we need to store a primitive data type like an int we must
        //use the approprate wrapper ie Integer[].
        String[] animals = {"dog", "cat", "bird"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);  //we can type in somthing to look for
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("horse");
        //comboBox.insertItemAt("pig", 0);  //
        //comboBox.setSelectedIndex(0); //defaut selection
        //comboBox.removeItem("cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();


        this.add(comboBox);
        //this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox) {
            //System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());

        }

    }
}
