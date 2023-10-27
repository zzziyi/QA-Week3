package org.example;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class GameTest {
    private Game game;

    @BeforeEach
    public void setup(){
        game = new Game(10);
    }

    @Test
    public void TestGetMonsterNumber(){
        game.setMonsterN(5);
        assertEquals(5,game.getMonsterN());
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

    @After
    public void finalise(){
        System.out.println("After test");
    }

}
