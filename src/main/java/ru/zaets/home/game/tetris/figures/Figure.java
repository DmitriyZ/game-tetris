package ru.zaets.home.game.tetris.figures;

import java.awt.*;

public abstract class Figure {
    private final Color color;
    private int[][] defaultTemplate;
    private int width;
    private int height;

    protected Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected void setDefaultTemplate(int[][] template) {
        defaultTemplate = template;
        height = template.length;
        width = template[0].length;
    }

    public int[][] getTemplate() {
        return defaultTemplate.clone();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
