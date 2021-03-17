package ru.zaets.home.game.tetris;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Bucket extends JComponent {

    private final Rectangle rectangle = new Rectangle(40, 40);

    public Bucket() {
        super();

        setLocation(70, 40);
        setBorder(new LineBorder(Color.CYAN));
        setBackground(Color.yellow);
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(100, 100);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        // paint the BG.
        g.setColor(getBackground());
        g.fillRect(0,0,getWidth(),getHeight());

        int margin = 10;
        Dimension dim = getSize();

        g.setColor(Color.red);
        g.fillRect(margin, margin, dim.width-margin*2, dim.height-margin*2);


        drawBucket((Graphics2D) g);
    }



    private void drawBucket(Graphics2D g2d) {

        g2d.drawRect(23,80,10,10);
        g2d.setColor(Color.green);
        g2d.fillRect(23,80,10,10);
    }


}
