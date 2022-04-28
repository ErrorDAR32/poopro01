package app;

import javax.swing.*;
import java.awt.*;

public class HistoryLabel extends JLabel {
    private int color;

    public HistoryLabel() {
        this.setOpaque(false);
        this.setSize(40, 40);
        this.setMinimumSize(new Dimension(40, 40));
        this.color = 6;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.getColor(color));
        g.fillOval(0, 0, 40, 40);
        //g.setColor(Color.BLUE);
        //g.fillRect(0,0,40,40);
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
