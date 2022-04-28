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
public class HistoryLabel extends JLabel {
    private int color;

    /**
     * Create the label with the dimensions
     * @param
     * @return void
     */
    public HistoryLabel() {
        this.setOpaque(false);
        this.setSize(40, 40);
        this.setMinimumSize(new Dimension(40, 40));
        this.color = 6;
    }

    /**
     * Method for get the number of color of the label
     * @param
     * @return int
     */
    public int getColor() {
        return color;
    }

    /**
     * Method for set the color to the label.
     * @param g(Graphics necesaries to the label)
     * @return void
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.getColor(color));
        g.fillOval(0, 0, 40, 40);
        //g.setColor(Color.BLUE);
        //g.fillRect(0,0,40,40);
    }

    /**
     * Method for set a new number of the color to the label
     * @param color(Number of the color)
     * @return void
     */
    public void setColorNumber(int color) {
        this.color = color;
    }

    /**
     * Method for get the color of the label.
     * @param
     * @return Color
     */
    public Color getColor(int c) {
        switch (c) {
            case (0) -> {
                return Color.GREEN;
            }
            case (1) -> {
                return Color.YELLOW;
            }
            case (2) -> {
                return Color.decode("#cceeFF");
            }
            case (3) -> {
                return Color.ORANGE;
            }
            case (4) -> {
                return Color.decode("#FF00FF");
            }
            case (6) -> {
                return Color.GRAY;
            }
        }
        return Color.lightGray;
    }
}