package ru.zaets.home.game.tetris.figures;

import java.awt.*;

public class SquareFigure extends Figure {

    private final  int[][] defaultTemplate = {
            {1, 1},
            {1, 1}
    };

    public SquareFigure(Color color) {
        super(color);
        super.setDefaultTemplate(defaultTemplate);
    }

}
