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


        GridBagLayout la = new GridBagLayout();

        ControlPanel = new JPanel();
        ControlPanel.setLayout(la);

        for (int i=0; i<4; i++) {
            GridBagConstraints c = new GridBagConstraints();
            c.gridwidth = 1;
            c.gridheight = 1;

            ColorButton b = new ColorButton();
            la.addLayoutComponent(b, c);
            ControlPanel.add(b);
        }

        JButton send = new JButton();
        send.setText("enviar");
        GridBagConstraints c = new GridBagConstraints();

        c.gridwidth = 4;
        c.gridheight = 1;
        la.setConstraints(send, c);
        ControlPanel.add(send);


    }
}
