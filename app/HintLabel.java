package app;

import javax.swing.*;
import java.awt.*;

public class HintLabel extends JButton {
    private int color;

    public void initialize() {
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setSize(20, 20);
        this.setMinimumSize(new Dimension(20, 20));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(getColor(color));
        g.fillOval(0, 0, 20, 20);
        //g.setColor(Color.BLUE);
        //g.fillRect(0,0,20,20);
    }


    public int getColor() {
        return color;
    }

    public void setColorNumber(int color) {
        this.color = color;
    }

    public Color getColor(int c) {
        switch (c) {
            case (0) -> {
                return Color.GRAY;
            }
            case (1) -> {
                return Color.RED;
            }
            case (2) -> {
                return Color.WHITE;
            }
        }
        return Color.lightGray;
    }
}
