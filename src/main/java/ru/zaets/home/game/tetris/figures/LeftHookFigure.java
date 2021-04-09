package ru.zaets.home.game.tetris.figures;

import java.awt.*;

public class LeftHookFigure extends Figure {

    private final  int[][] defaultTemplate = {
            {1, 0, 0},
            {1, 1, 1}
    };

    public LeftHookFigure(Color color) {
        super(color);
        super.setDefaultTemplate(defaultTemplate);
    }

}
