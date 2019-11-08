package com.nix;

public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return max(root, 0);
    }
    public static int max(TreeNode root, int max)
    {
        if (root==null) return max;
        return Math.max(max(root.left,max+1), max(root.right,max+1));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
