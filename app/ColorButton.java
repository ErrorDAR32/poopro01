package app;

import javax.swing.*;
import java.awt.*;

public class ColorButton extends JButton {
    private int ColorNumber;

    public Integer getColorNumber() {
        return ColorNumber;
    }

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

    public void setColorNumber(int currentColor) {
        this.ColorNumber = currentColor;
    }

    public void nextColor() {
        ColorNumber = (ColorNumber + 1)%5;
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
        g.setColor(this.getColor());
        g.fillOval(5, 0, 25, 25);
    }


}