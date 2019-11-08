package com.nix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest {
    private Horse horseInstance;
    @Before
    public void before()
    {
        horseInstance = new Horse();
    }

    @Test
    public void WrongStartTest()
    {
       Horse.Point start = new Horse.Point(-1,9);
        Horse.Point end = new Horse.Point(2,7);
        Assert.assertFalse(horseInstance.canGo(start, end));
    }

    @Test
    public void CantGoTest()
    {
        Horse.Point start = new Horse.Point(1,1);
        Horse.Point end = new Horse.Point(2,2);
        Assert.assertFalse(horseInstance.canGo(start, end));
    }

    @Test
    public void TooFarTest()
    {
        Horse.Point start = new Horse.Point(1,1);
        Horse.Point end = new Horse.Point(3,3);
        Assert.assertFalse(horseInstance.canGo(start, end));
    }

    @Test
    public void CanGoTest()
    {
        Horse.Point start = new Horse.Point(1,1);
        Horse.Point end = new Horse.Point(2,3);
        Assert.assertTrue(horseInstance.canGo(start, end));
    }

    @Test
    public void SameSquareTest()
    {
        Horse.Point start = new Horse.Point(1,1);
        Horse.Point end = new Horse.Point(1,1);
        Assert.assertTrue(horseInstance.canGo(start, end));
    }
}
