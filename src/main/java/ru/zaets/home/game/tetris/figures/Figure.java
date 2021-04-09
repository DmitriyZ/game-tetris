package ru.zaets.home.game.tetris.figures;

import java.awt.*;

public abstract class Figure {
    private final Color color;
    private int[][] defaultTemplate;

    protected Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int[][] getTemplate() {
        return defaultTemplate.clone();
    }

}
