/**
 * Container Package
 */
package app;

/**
 * Necesary imports
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * This class represents the graphic part of the program, the interface.
 * @author: Dariem F. Hidalgo, Pablo A. Arguedas.
 * @version: 27/04/2022
 */
public class Interface {

    /**
     * Declarations
     */
    private mastermind gamestate;
    public JPanel panelMain;
    private JPanel HistoryPanel;
    private JPanel ControlPanel;
    private JPanel HintsPanel;
    private JButton Send_button;
    private ColorButton control_button1;
    private ColorButton control_button2;
    private ColorButton control_button3;
    private ColorButton control_button4;

    ArrayList<HistoryLabel> HistoryLabels;
    ArrayList<ColorButton> Control_Buttons;
    ArrayList<HintLabel> HintLabels;

    /**
     * Declare the different methods of the buttons of the board.
     * @param
     * @return void
     */
    public Interface(){
        control_button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                control_button1.nextColor();
                control_button1.updateUI();
            }
        });


        control_button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                control_button2.nextColor();
                control_button2.updateUI();
            }
        });


        control_button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                control_button3.nextColor();
                control_button3.updateUI();
            }
        });


        control_button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                control_button4.nextColor();
                control_button4.updateUI();
            }
        });
        Send_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ArrayList<Integer> guess = new ArrayList<>();

                guess.add(control_button1.getColorNumber());
                guess.add(control_button2.getColorNumber());
                guess.add(control_button3.getColorNumber());
                guess.add(control_button4.getColorNumber());

                gamestate.addGuess(guess);
                ArrayList<Integer> hints = gamestate.CheckColors();

                //update historycolorpoints
                for(int i=0;i<4;i++) {
                    HistoryLabel b = HistoryLabels.get(gamestate.getCurrentRow()+i-4);
                    b.setColorNumber(guess.get(i));
                    b.updateUI();
                }

                //updatehintscolorpoints
                for(int i=0;i<4;i++) {
                    HintLabel b = HintLabels.get(gamestate.getCurrentRow()+i-4);
                    b.setColorNumber(hints.get(i));
                    b.updateUI();
                }

                System.out.println(hints);

                boolean alltwo = true;
                for(int hint : hints) {
                    if(hint != 2) {
                        alltwo = false;
                    } else continue;

                    if (!alltwo) {
                        break;
                    }

                    WinGame dialog = new WinGame();
                    dialog.pack();
                    dialog.setVisible(true);
                    Integer result = dialog.getresult();
                    dialog.dispose();

                    if (result == 0) {
                        System.exit(0);
                    } else {
                        gamestate.reset();

                        for(int i=0; i<40; i++) {
                            HintLabels.get(i).setColorNumber(6);
                            HintLabels.get(i).updateUI();
                            HistoryLabels.get(i).setColorNumber(6);
                            HistoryLabels.get(i).updateUI();
                        }
                    }

                }


                if (gamestate.CurrentRow == 40) {
                    //game ended, prompt
                    EndOFGame dialog = new EndOFGame();
                    dialog.pack();
                    dialog.setVisible(true);
                    Integer result = dialog.getresult();
                    dialog.dispose();

                    if (result == 1) {
                        gamestate.reset();

                        for(int i=0; i<40; i++) {
                            HintLabels.get(i).setColorNumber(6);
                            HintLabels.get(i).updateUI();
                            HistoryLabels.get(i).setColorNumber(6);
                            HistoryLabels.get(i).updateUI();
                        }
                    }

                    if (result == 0) {
                        System.exit(0);
                    }
                }
            }
        });
    }

    /**
     * Method for get the gamestate of the board.
     * @param
     * @return mastermind
     */
    public mastermind getGamestate() {
        return gamestate;
    }

    /**
     * Method for set the gamestate to the board.
     * @param
     * @return mastermind
     */
    public void setGamestate(mastermind gamestate) {
        this.gamestate = gamestate;
    }

    /**
     * Method for create all the components necesaries of the board.
     * @param
     * @return void
     */
    private void createUIComponents() {
        GridLayout l = new GridLayout(10,4);
        l.setVgap(15);

        HistoryPanel = new JPanel(l);
        HistoryPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        HistoryLabels = new ArrayList<>();

        for(int i=0; i<10; i++) {
            for (int j=0; j<4; j++) {
                HistoryLabel b = new HistoryLabel();
                b.setEnabled(false);

                HistoryPanel.add(b);
                HistoryLabels.add(b);
            }
        }

        HintsPanel = new JPanel(new GridLayout(20,2));
        HintLabels = new ArrayList<>();

        for(int i=0; i<10; i++) {
            for (int j=0; j<4; j++) {
                HintLabel b = new HintLabel();
                b.initialize();
                b.setEnabled(true);

                HintsPanel.add(b);
                HintLabels.add(b);
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

        Control_Buttons = new ArrayList<>();

        Control_Buttons.add(control_button1);
        Control_Buttons.add(control_button2);
        Control_Buttons.add(control_button3);
        Control_Buttons.add(control_button4);
    }

}
