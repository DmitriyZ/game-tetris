package ru.zaets.home.game.tetris;

import ru.zaets.home.game.tetris.figures.*;
import ru.zaets.home.game.tetris.stage.Bucket;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class GameImpl implements Game {

    public static void main(String[] args) throws InterruptedException {
        Game game = new GameImpl();
        game.start();

    }
    @Override
    public void start() throws InterruptedException {
        List<Figure> figures = new ArrayList<>();
        figures.add(new LeftDogFigure(Color.RED));
        figures.add(new LeftHookFigure(Color.RED));
        figures.add(new PyramidFigure(Color.RED));
        figures.add(new RightDogFigure(Color.RED));
        figures.add(new RightHookFigure(Color.RED));
        figures.add(new SquareFigure(Color.RED));
        figures.add(new StickFigure(Color.RED));

        boolean inAction = false;
        Figure figure;
        Bucket bucket = new Bucket();
        while (true) {
            if (!inAction) {
                figure = figures.get(ThreadLocalRandom.current().nextInt(0, figures.size()));
                bucket.fallDown(figure);
            }


            inAction = bucket.down();

            bucket.print();

            TimeUnit.MILLISECONDS.sleep(500);

        }

    }

    @Override
    public void pause() {

    }

    @Override
    public void reset() {

    }

    @Override
    public void setLevel() {

    }
}
