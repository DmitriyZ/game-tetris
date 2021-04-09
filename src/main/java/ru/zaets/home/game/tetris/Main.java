package ru.zaets.home.game.tetris;

import ru.zaets.home.game.tetris.stage.Bucket;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }

    private static void createAndShowGui() {
        TestComponent testComponent = new TestComponent();


        JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Container contentPane = frame.getContentPane();
//        contentPane.setBackground(Color.white);
        frame.add(testComponent);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        frame.setSize(700, 700);
        frame.setMinimumSize(frame.getSize());
        frame.setLocation(100,100);

    }
}
