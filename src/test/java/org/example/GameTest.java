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
    @Test
    public void TestMonsterGreet(){
        String expectRedbuffGreet = "RedBuff: Give you one more life!";
        String expectDragonGreet = "Dragon: Destroy everything!";
        assertEquals(expectRedbuffGreet,game.RedbuffGreet());
        assertEquals(expectDragonGreet,game.DragonGreet());
    }

    @Test
    public void TestPointDirection(){
        game.setTreasureX(4);
        game.setTreasureY(4);
        game.setPlayerX(2);
        game.setPlayerY(3);
        assertEquals("Treasure is at your right and top",game.pointDirection());
        game.setPlayerX(2);
        game.setPlayerY(7);
        assertEquals("Treasure is at your right and down",game.pointDirection());
        game.setPlayerX(5);
        game.setPlayerY(1);
        assertEquals("Treasure is at your left and top",game.pointDirection());
        game.setPlayerX(5);
        game.setPlayerY(7);
        assertEquals("Treasure is at your left and down",game.pointDirection());
    }
    @After
    public void finalise(){
        System.out.println("After test");
    }

}
