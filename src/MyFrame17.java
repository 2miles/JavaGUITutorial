import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame17 extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu helpMenu;
    private JMenuItem loadItem;
    private JMenuItem saveItem;
    private JMenuItem exitItem;
    //private ImageIcon loadIcon;
    //private ImageIcon saveIcon;
    //private ImageIcon exitIcon;


    public MyFrame17() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        //loadIcon = new ImageIcon( "load.png");
        //saveIcon = new ImageIcon( "save.png");
        //exitIcon = new ImageIcon( "exit.png");

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        //loadItem.setIcon(loadIcon);
        //saveItem.setIcon(saveIcon);
        //exitItem.setIcon(exitIcon);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        //set up keybindings for the menu
        fileMenu.setMnemonic(KeyEvent.VK_F);  //alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E);  //alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H);  //alt + h for help
        loadItem.setMnemonic(KeyEvent.VK_L);  //l for load
        saveItem.setMnemonic(KeyEvent.VK_S);  //s for save
        exitItem.setMnemonic(KeyEvent.VK_E);  //e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem) {
            System.out.println("you loaded a file");
        }
        if(e.getSource() == saveItem) {
            System.out.println("you saved a file");
        }
            if(e.getSource() == exitItem) {
                System.exit(0);
            }
    }
}
