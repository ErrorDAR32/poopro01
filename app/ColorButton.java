package app;

import javax.swing.*;
import java.awt.*;

public class ColorButton extends JButton {
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
        g.setColor(Color.GREEN);
        g.fillOval(5, 0, 25, 25);
    }
}
