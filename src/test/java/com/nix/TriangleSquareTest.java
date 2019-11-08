package com.nix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleSquareTest {
    private TriangleSquare triangleSquareInstance;
    @Before
    public void before()
    {
        triangleSquareInstance = new TriangleSquare();
    }

    @Test(expected = NullPointerException.class)
    public void NullTest()
    {
        triangleSquareInstance.getSquare(null, new TriangleSquare.Point(1,2), new TriangleSquare.Point(1,2));
    }
    @Test
    public void AllZeroTest()
    {
        TriangleSquare.Point a = new TriangleSquare.Point(0,0);
        TriangleSquare.Point b = new TriangleSquare.Point(0,0);
        TriangleSquare.Point c = new TriangleSquare.Point(0,0);
        double actual = triangleSquareInstance.getSquare(a,b,c);

        Assert.assertEquals(0, actual, 0.000);
    }
    @Test
    public void Square2Test()
    {
        TriangleSquare.Point a = new TriangleSquare.Point(0,0);
        TriangleSquare.Point b = new TriangleSquare.Point(1,0);
        TriangleSquare.Point c = new TriangleSquare.Point(1,4);
        double actual = triangleSquareInstance.getSquare(a,b,c);

        Assert.assertEquals(2, actual, 0.000);
    }

    @Test
    public void SquareTest()
    {
        TriangleSquare.Point a = new TriangleSquare.Point(2,5);
        TriangleSquare.Point b = new TriangleSquare.Point(1,6);
        TriangleSquare.Point c = new TriangleSquare.Point(-3,-2);
        double actual = triangleSquareInstance.getSquare(a,b,c);

        Assert.assertEquals(6, actual, 0.000);
    }

    @Test
    public void OnOneLine()
    {
        TriangleSquare.Point a = new TriangleSquare.Point(1,7);
        TriangleSquare.Point b = new TriangleSquare.Point(1,6);
        TriangleSquare.Point c = new TriangleSquare.Point(1,-2);
        double actual = triangleSquareInstance.getSquare(a,b,c);

        Assert.assertEquals(0, actual, 0.000);
    }
}
