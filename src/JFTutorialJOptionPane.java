import javax.swing.*;

public class JFTutorialJOptionPane {
    //JOptionPane: pop up a standard dialog box that
    //             prompts users for a value or informs them of somthing

    public static void main(String[] args) {

        // (parentComponent, massage, title, messageType)
        //JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.ERROR_MESSAGE);

        //returns 0,1,2 depending on the response
        //int answer = JOptionPane.showConfirmDialog(null, "Bro stfu", "This is a titile", JOptionPane.YES_NO_CANCEL_OPTION);

        //String name = JOptionPane.showInputDialog("What is your moms name");
        //System.out.println(name);

        ImageIcon icon = new ImageIcon("mwLogo.png");
        String[] responses = { "No, youre sick", "noice", "dasswussup"};
        //combines all of them together into one
        // (parentComponent, message, title, optionType, messageType, icon, options, initialValue)
        JOptionPane.showOptionDialog(null,
                "you are so sick",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon, responses, 0);

    }
}
