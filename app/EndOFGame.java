package app;

import javax.swing.*;
import java.awt.event.*;

public class EndOFGame extends JDialog {
    private Integer res;
    private JPanel contentPane;
    private JButton YesButton;
    private JButton NoButton;
    private JButton CancelButton;
    private JTextArea susTurnosSeHanTextArea;

    public EndOFGame() {
        this.res = 0;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(YesButton);

        YesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        NoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        CancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        res = 1;
        this.setVisible(false);
    }

    private void onCancel() {
        res = 0;
        this.setVisible(false);
    }

    public Integer getresult() {
        return res;
    }
}
