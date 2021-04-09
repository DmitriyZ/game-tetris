package ru.zaets.home.game.tetris.figures;

import java.awt.*;

public class LeftDogFigure extends Figure {

    private final int[][] defaultTemplate = {
            {1, 1, 0},
            {0, 1, 1}
    };

    public LeftDogFigure(Color color) {
        super(color);
        super.setDefaultTemplate(defaultTemplate);
    }

}
