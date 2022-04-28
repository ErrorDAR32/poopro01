/**
 * Container Package
 */
package app;

/**
 * Necesary imports
 */
import javax.swing.*;
import java.util.ArrayList;

/**
 * This class represents the start of the program.
 * @author: Dariem F. Hidalgo, Pablo A. Arguedas.
 * @version: 27/04/2022
 */
public class app {

    /**
     * Method main to start the program on this point.
     * @param
     * @return void
     */
    public static void main(String[] args)
    {
        JFrame I = new JFrame("Interface");
        Interface i = new Interface();
        I.setContentPane(i.panelMain);
        I.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        I.pack();
        I.setVisible(true);


        //ArrayList<Integer> solution = new ArrayList<>();
        //solution.add(0);
        //solution.add(1);
        //solution.add(2);
        //solution.add(3);

        mastermind m = new mastermind();
        i.setGamestate(m);
    }
}
