package ru.zaets.home.game.tetris;

public interface Game {

    void start() throws InterruptedException;
    void pause();
    void reset();
    void setLevel();
}
