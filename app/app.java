
package app;
import javax.swing.*;
import java.util.ArrayList;

public class app {

    public static void main(String[] args)
    {
        JFrame I = new JFrame("Interface");
        Interface i = new Interface();
        I.setContentPane(i.panelMain);
        I.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        I.pack();
        I.setVisible(true);


        ArrayList<Integer> solution = new ArrayList<>();
        solution.add(0);
        solution.add(1);
        solution.add(2);
        solution.add(3);

        mastermind m = new mastermind(solution);
        i.setGamestate(m);

    }
}
