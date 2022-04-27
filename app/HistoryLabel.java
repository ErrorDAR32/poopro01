package app;

import javax.swing.*;
import java.awt.*;

public class HistoryLabel extends JLabel {
    public void initialize() {
        this.setOpaque(false);
        this.setSize(40, 40);
        this.setMinimumSize(new Dimension(40, 40));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(0, 0, 40, 40);
        //g.setColor(Color.BLUE);
        //g.fillRect(0,0,40,40);
    }
}
