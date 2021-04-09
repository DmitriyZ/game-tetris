package ru.zaets.home.game.tetris.figures;

import java.awt.*;

public class StickFigure extends Figure {

    private final int[][] defaultTemplate = {
            {1, 1, 1, 1}
    };

    public StickFigure(Color color) {
        super(color);
    }

}
