package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
    private JTextField textField1;
    private JPanel panelMain;
    private JButton button1_row1;
    private JButton button2_row1;
    private JButton button3_row1;
    private JButton button4_row1;
    private JButton button1_row2;
    private JButton button2_row2;
    private JButton button3_row2;
    private JButton button4_row2;
    private JButton button1row3;
    private JButton button2_row3;
    private JButton button3_row3;
    private JButton button4_row3;
    private JButton button1_row4;
    private JButton button2_row4;
    private JButton button3_row4;
    private JButton button4_row4;
    private JButton button1_row5;
    private JButton button2_row5;
    private JButton button3_row5;
    private JButton button4_row5;
    private JButton button1_row6;
    private JButton button2_row6;
    private JButton button3_row6;
    private JButton button4_row6;
    private JButton button1_row7;
    private JButton button2_row7;
    private JButton button3_row7;
    private JButton button4_row7;
    private JButton button1_row8;
    private JButton button2_row8;
    private JButton button3_row8;
    private JButton button4_row8;
    private JButton button1_row9;
    private JButton button2_row9;
    private JButton button3_row9;
    private JButton button4_row9;
    private JButton button1_row10;
    private JButton button2_row10;
    private JButton button3_row10;
    private JButton button4_row10;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panelTurns;
    private JButton enviarButton;

    public Interface(){

        button1_row1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, textField1.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame I = new JFrame("Interface");
        I.setContentPane(new Interface().panelMain);
        I.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        I.pack();
        I.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
