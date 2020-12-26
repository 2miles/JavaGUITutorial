import javax.swing.*;

public class MyFrame25 extends JFrame {



    private MyPanel25 panel;

    public MyFrame25() {

        panel = new MyPanel25() ;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

}
