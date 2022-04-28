package app;

import javax.swing.*;
import java.awt.*;

public class ColorButton extends JButton {
    private int currentColor;

    public int getCurrentColor() {
        return currentColor;
    }

    public Color getColor() {
        switch (currentColor) {
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
        }
        return Color.lightGray;
    }

    public void setCurrentColor(int currentColor) {
        this.currentColor = currentColor;
    }

    public void nextColor() {
        currentColor = (currentColor + 1)%5;
    }

    public void initialize() {
        this.setText("");
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setSize(40, 40);
        this.setMinimumSize(new Dimension(40, 40));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(3, -2, 29, 29);
        g.setColor(getColor());
        g.fillOval(5, 0, 25, 25);
    }
}