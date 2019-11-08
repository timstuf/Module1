package com.nix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SymbolsTest {
    private Symbols symbolsInstance;
    @Before
    public void before()
    {
        symbolsInstance = new Symbols();
    }
    @Test
    public void AllByThemselvesTest()
    {
        Assert.assertTrue(symbolsInstance.checkSymbols("(){}[]"));
    }

    @Test
    public void AllNestedTest()
    {
        Assert.assertTrue(symbolsInstance.checkSymbols("([])"));
    }

    @Test
    public void EmptyTest()
    {
        Assert.assertTrue(symbolsInstance.checkSymbols(""));
    }

    @Test
    public void StartsWrongTest()
    {
        Assert.assertFalse(symbolsInstance.checkSymbols("](){}[]"));
    }

    @Test
    public void WrongOrderTest()
    {
        Assert.assertFalse(symbolsInstance.checkSymbols("({)}"));
    }

    @Test
    public void AllDifferent()
    {
        Assert.assertTrue(symbolsInstance.checkSymbols("(){[]}"));
    }
}
