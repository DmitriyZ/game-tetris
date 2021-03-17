package ru.zaets.home.game.tetris;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }

    private static void createAndShowGui() {
        Bucket bucket = new Bucket();


        JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.add(bucket);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        frame.setSize(700, 700);
        frame.setMinimumSize(frame.getSize());
        frame.setLocation(100,100);

    }
}
