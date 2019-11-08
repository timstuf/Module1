package com.nix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LifeGameTest {
    private LifeGame lifeGameInstance;
    @Before
    public void before()
    {
        lifeGameInstance = new LifeGame();
    }
    @Test (expected = NullPointerException.class)
    public void NullTest()
    {
        lifeGameInstance.getNextState(null);
    }

    @Test
    public void ZeroFieldTest()
    {
        int[][] expected = new int[0][0];
        int[][] actual = lifeGameInstance.getNextState(new int[0][0]);

        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void OneSquareTest()
    {
        int[][] expected = {{0}};
        int[][] field = {{1}};
        int[][] actual = lifeGameInstance.getNextState(field);

        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void AllAliveTest()
    {
        int[][] expected = {{1,0,1},{1,0,1}};
        int[][] field = {{1,1,1},{1,1,1}};
        int[][] actual = lifeGameInstance.getNextState(field);

        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void AllDeadTest()
    {
        int[][] expected = {{0,0,0},{0,0,0}};
        int[][] field = {{0,0,0},{0,0,0}};
        int[][] actual = lifeGameInstance.getNextState(field);

        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void AliveDead34Test()
    {
        int[][] expected = {{1,0,1,0},{1,0,0,0},{1,0,0,1}};
        int[][] field = {{1,0,0,1},{1,1,1,0},{0,1,1,1}};
        int[][] actual = lifeGameInstance.getNextState(field);

        Assert.assertArrayEquals(expected,actual);
    }
}
