/**
 * Container Package
 */
package app;

/**
 * Necesary imports
 */
import javax.swing.*;
import java.awt.*;

/**
 * This class declare a special label with some necesaty atributes.
 * @author: Dariem F. Hidalgo, Pablo A. Arguedas.
 * @version: 27/04/2022
 */
public class HintLabel extends JButton {
    /**
     * Declarations
     */
    private int color;

    /**
     * Create the label with the dimensions necesaries.
     * @param
     * @return void
     */
    public void initialize() {
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setSize(20, 20);
        this.setMinimumSize(new Dimension(20, 20));
    }

    /**
     * Set the color to the label.
     * @param g(Graphics necesaries to the label)
     * @return void
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(getColor(color));
        g.fillOval(0, 0, 20, 20);
        //g.setColor(Color.BLUE);
        //g.fillRect(0,0,20,20);
    }

    /**
     * Method for set the number of color to the label
     * @param
     * @return int
     */
    public void setColorNumber(int color) {
        this.color = color;
    }

    /**
     * Method for get the color of the label
     * @param c(number of the color of label)
     * @return Color
     */
    public Color getColor(int c) {
        switch (c) {
            case (0) -> {
                return Color.GRAY;
            }
            case (1) -> {
                return Color.WHITE;
            }
            case (2) -> {
                return Color.RED;
            }
        }
        return Color.GRAY;
    }
}
