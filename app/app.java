
package app;
import javax.swing.*;

public class app {

    public static void main(String[] args)
    {
        JFrame I = new JFrame("Interface");
        I.setContentPane(new Interface().panelMain);
        I.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        I.pack();
        I.setVisible(true);
    }
}
