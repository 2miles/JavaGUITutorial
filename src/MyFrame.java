import javax.swing.*; //JFrame, JLabel, ImageIcon, BorderFactory
import javax.swing.border.Border;
import java.awt.*;  //Color, Font

public class MyFrame extends JFrame {

    private JLabel label;

    public MyFrame() { }

    public void buildFrame() {

        this.setTitle("This is the title"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        this.setSize(420,420);

        //the default layout causes the label to take up the whole window
        //this.setLayout(null);// this removes any layout, letting us determine the size of the label manually

        this.addLabel();

        this.setVisible(true);  //makes the frame visible
        ImageIcon image = new ImageIcon("mwLogo.png"); //create an imageIcon
        this.setIconImage(image.getImage());  //change icon of frame

        //frame.getContentPane().setBackground(Color.CYAN); //change color of background
        this.getContentPane().setBackground(new Color(200,110,90)); //change color of background

        //make sure you add all the compentents before calling pack
        this.pack(); //adjusts the default size of the window to fit all its components
    }


    public void addLabel() {
        ImageIcon image = new ImageIcon("mwLogo.png"); //set text of label

        Border border = BorderFactory.createLineBorder(Color.green,3); //creates a border object

        this.label = new JLabel();  //create label
        this.label.setIcon(image);  //set Image of label

        //determines the location of text in the label relative to the image
        this.label.setVerticalTextPosition(JLabel.TOP);
        this.label.setHorizontalTextPosition(JLabel.CENTER);
        //set the font color of the text of our label
        this.label.setForeground(new Color(60, 110, 50));
        //change the font styling
        this.label.setFont(new Font("MV Boli", Font.BOLD, 50));
        this.label.setIconTextGap(30); //set gap between text and image

        // by default the bacground is transperent and this wont be seen
        this.label.setBackground(Color.BLACK);
        this.label.setOpaque(true);  //this allows the background to be seen
        this.label.setBorder(border);  //puts the border we created around our label
        this.label.setVerticalAlignment(JLabel.CENTER); //set the vert. pos. of icon+text within label
        this.label.setHorizontalAlignment(JLabel.CENTER);//set the horiz. pos. of icon+text within label

        //set x,y position within frame, as well as dimentions
        //this.label.setBounds(100,50, 350,350);

        this.label.setText("This is a sick label");
        this.add(label);

    }

}
