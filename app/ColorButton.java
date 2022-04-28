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
public class ColorButton extends JButton {
    /**
     * Declarations
     */
    private int ColorNumber;

    /**
     * Method for get the color number of the button
     * @param
     * @return Integer
     */
    public Integer getColorNumber() {
        return ColorNumber;
    }

    /**
     * Method for get the color of the button
     * @param
     * @return Color
     */
    public Color getColor() {
        switch (ColorNumber) {
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

    /**
     * Method for set the color number to the button
     * @param currentColor(The number of the color)
     * @return void
     */
    public void setColorNumber(int currentColor) {
        this.ColorNumber = currentColor;
    }

    /**
     * Method for change the color to the button
     * @param
     * @return void
     */
    public void nextColor() {
        ColorNumber = (ColorNumber + 1)%5;
    }

    /**
     * Method for create a button with a certain atributes
     * @param
     * @return void
     */
    public void initialize() {
        this.setText("");
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setSize(40, 40);
        this.setMinimumSize(new Dimension(40, 40));
    }

    /**
     * Methof for put the color to the button
     * @param g(Graphics necesaries to the button)
     * @return void
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(3, -2, 29, 29);
        g.setColor(this.getColor());
        g.fillOval(5, 0, 25, 25);
    }
}