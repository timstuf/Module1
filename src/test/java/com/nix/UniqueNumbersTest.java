package com.nix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniqueNumbersTest {
    private UniqueNumbers uniqueNumbersInstance;
    @Before
    public void before()
    {
        uniqueNumbersInstance = new UniqueNumbers();
    }

    @Test (expected = NullPointerException.class)
    public void NullTest()
    {
        uniqueNumbersInstance.uniqueSymbols(null);
    }

    @Test(expected = IllegalStateException.class)
    public void ZeroLengthTest()
    {
        int[] array = new int[0];
        uniqueNumbersInstance.uniqueSymbols(array);
    }

    @Test
    public void AllSameTest()
    {
        int[] array = {1,1,1,1,1,1};
        int actual = uniqueNumbersInstance.uniqueSymbols(array);

        Assert.assertEquals(1,actual);
    }

    @Test
    public void AllDifferentTest()
    {
        int[] array = {1,2,3,4,5};
        int actual = uniqueNumbersInstance.uniqueSymbols(array);

        Assert.assertEquals(5,actual);
    }

    @Test
    public void SomeSameTest()
    {
        int[] array = {1,1,2,2,3,4};
        int actual = uniqueNumbersInstance.uniqueSymbols(array);

        Assert.assertEquals(4,actual);
    }
}
