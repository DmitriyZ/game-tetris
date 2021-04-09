package ru.zaets.home.game.tetris.figures;

import java.awt.*;

public class RightHookFigure extends Figure {

    private final  int[][] defaultTemplate = {
            {0, 0, 1},
            {1, 1, 1}
    };

    public RightHookFigure(Color color) {
        super(color);
    }


}
