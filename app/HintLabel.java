package app;

import javax.swing.*;
import java.awt.*;

public class HintLabel extends JButton {
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
        g.setColor(Color.YELLOW);
        g.fillOval(0, 0, 20, 20);
        //g.setColor(Color.BLUE);
        //g.fillRect(0,0,20,20);
    }
}
