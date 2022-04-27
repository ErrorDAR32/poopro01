package app;

import javax.swing.*;
import java.awt.*;

public class Interface {
    private JTextField textField1;
    public JPanel panelMain;
    private JButton button1_row3;
    private JPanel HistoryPanel;
    private JPanel ControlPanel;
    private JPanel HintsPanel;
    private JButton Send_button;
    private ColorButton control_button1;
    private ColorButton control_button2;
    private ColorButton control_button3;
    private ColorButton control_button4;

    public Interface(){
        
    }

    public static void main(String[] args) {

    }

    private void createUIComponents() {
        GridLayout l = new GridLayout(10,4);
        l.setVgap(15);

        HistoryPanel = new JPanel(l);
        HistoryPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));


        for(int i=0; i<10; i++) {
            for (int j=0; j<4; j++) {
                HistoryLabel b = new HistoryLabel();
                b.initialize();
                b.setEnabled(false);

                HistoryPanel.add(b);
            }
        }

        HintsPanel = new JPanel(new GridLayout(20,2));

        for(int i=0; i<10; i++) {
            for (int j=0; j<4; j++) {
                HintLabel b = new HintLabel();
                b.initialize();
                b.setEnabled(true);

                HintsPanel.add(b);
            }
        }


        control_button1 = new ColorButton();
        control_button1.initialize();

        control_button2 = new ColorButton();
        control_button2.initialize();

        control_button3 = new ColorButton();
        control_button3.initialize();

        control_button4 = new ColorButton();
        control_button4.initialize();
    }
}
