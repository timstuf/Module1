package com.nix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumDepthTest {
    private MaximumDepth maximumDepthInstance;
    @Before
    public void before()
    {
        maximumDepthInstance = new MaximumDepth();
    }
     @Test
    public void NullRootTest()
     {
         int actual = maximumDepthInstance.maxDepth(null);
         Assert.assertEquals(0, actual);
     }

    @Test
    public void RootAndChildTest()
    {
        MaximumDepth.TreeNode root = new MaximumDepth.TreeNode(0);
        MaximumDepth.TreeNode left = new MaximumDepth.TreeNode(1);
        MaximumDepth.TreeNode right = new MaximumDepth.TreeNode(1);

        root.left = left;
        root.right = right;
        int actual = maximumDepthInstance.maxDepth(root);
        Assert.assertEquals(2, actual);
    }
    @Test
    public void OnlyRootTest()
    {
        MaximumDepth.TreeNode root = new MaximumDepth.TreeNode(0);
        int actual = maximumDepthInstance.maxDepth(root);
        Assert.assertEquals(1, actual);
    }
    @Test
    public void OneWay3Test()
    {
        MaximumDepth.TreeNode root = new MaximumDepth.TreeNode(0);
        MaximumDepth.TreeNode leaf1 = new MaximumDepth.TreeNode(0);
        MaximumDepth.TreeNode leaf2 = new MaximumDepth.TreeNode(0);
        root.left = leaf1;
        leaf1.left = leaf2;

        int actual = maximumDepthInstance.maxDepth(root);
        Assert.assertEquals(3, actual);
    }
    @Test
    public void Deep4Test()
    {
        MaximumDepth.TreeNode root = new MaximumDepth.TreeNode(0);
        MaximumDepth.TreeNode leaf1 = new MaximumDepth.TreeNode(0);
        MaximumDepth.TreeNode leaf2 = new MaximumDepth.TreeNode(0);
        MaximumDepth.TreeNode leaf3 = new MaximumDepth.TreeNode(0);
        MaximumDepth.TreeNode leaf4 = new MaximumDepth.TreeNode(0);
        MaximumDepth.TreeNode leaf5 = new MaximumDepth.TreeNode(0);
        root.left = leaf1;
        root.right = leaf2;
        leaf1.left = leaf3;
        leaf2.left = leaf4;
        leaf4.right = leaf5;

        int actual = maximumDepthInstance.maxDepth(root);
        Assert.assertEquals(4, actual);
    }
}
