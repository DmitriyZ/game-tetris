package ru.zaets.home.game.tetris.figures;

import java.awt.*;

public class RightDogFigure extends Figure {

    private final int[][] defaultTemplate = {
            {0, 1, 1},
            {1, 1, 0}
    };

    public RightDogFigure(Color color) {
        super(color);
    }

}
