package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private Game game;

    @BeforeEach
    public void setup(){
        game = new Game(10);
        game.setPlayerLife(1);
    }

    @Test
    public void TestWinGame(){
        game.StartGame();
        game.setPlayerX(game.getTreasureX());
        game.setPlayerY(game.getTreasureY());
        //assertEquals("Brilliant! Win the treasure!",game.ifwin());
    }

    @Test
    public void TestSetPlayerLife(){
        game.setPlayerLife(3);
        assertEquals(3,game.getPlayerLife());
    }

    @Test
    public void TestSetTreasure(){
        game.setTreasureX(4);
        game.setTreasureY(8);
        assertEquals(4,game.getTreasureX());
        assertEquals(8,game.getTreasureY());
    }

}
