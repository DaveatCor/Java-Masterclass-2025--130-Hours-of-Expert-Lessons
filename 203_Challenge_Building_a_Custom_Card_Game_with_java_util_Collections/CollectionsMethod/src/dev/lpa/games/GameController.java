package dev.lpa.games;

import dev.lpa.games.poker.PockerGame;

public class GameController {
    public static void main(String[] args) {
        PockerGame fiveCardDraw = new PockerGame(4, 5);
        fiveCardDraw.startPlay();

    }
}
