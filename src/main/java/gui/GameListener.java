package gui;

/**
 * Created by nnthienbao on 20/06/2017.
 */
public interface GameListener {
    void onRestartGame();
    int onGameOver(boolean playerWin, int xLast, int yLast, int time);
}
