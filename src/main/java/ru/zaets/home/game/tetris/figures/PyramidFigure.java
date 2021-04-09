package ru.zaets.home.game.tetris.figures;

import java.awt.*;

public class PyramidFigure extends Figure {


    private final int[][] defaultTemplate = {
            {0, 1, 0},
            {1, 1, 1}
    };

    public PyramidFigure(Color color) {
        super(color);
    }

}
